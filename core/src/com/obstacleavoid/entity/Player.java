package com.obstacleavoid.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;

public class Player {

    private static final float BOUNDS_RADIUS = 0.4f;
    private static final float SIZE = 2 * BOUNDS_RADIUS;
    private static final float MAX_X_SPEED = 0.25f; // world units

    private float x;
    private float y; // 0 by default

    private Circle bounds;

    public Player() {
        bounds = new Circle(x, y, BOUNDS_RADIUS);
    }

    private void updateBounds(){
        // now whenever we position our player we automatically
        // reposition our bounds
        bounds.setPosition(x, y);
    }

    public void drawDebug(ShapeRenderer renderer) {
        renderer.circle(bounds.x, bounds.y, bounds.radius, 30);

    }


    public void update(){
        float xSpeed = 0;

        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            xSpeed = MAX_X_SPEED;
        } else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            xSpeed = -MAX_X_SPEED;
        }

        x += xSpeed;
        updateBounds();
    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;

        updateBounds();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}

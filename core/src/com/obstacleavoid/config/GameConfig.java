package com.obstacleavoid.config;

// only contains constants
// disallow instantiation
public class GameConfig {

    // width and height of desktop window in pixels
    public static final float WIDTH = 480;
    public static final float HEIGHT = 800;

    // think in world units 6 x 10
    public static final float WORLD_WIDTH = 6.0f; // world units
    public static final float WORLD_HEIGHT = 10.0f; // world units

    public static final float WORLD_CENTER_X = WORLD_WIDTH / 2f; // world units
    public static final float WORLD_CENTER_Y = WORLD_HEIGHT / 2f;



    private GameConfig() {

    }
}

package com.jme3test.helloworld;

import com.jme3.app.SimpleApplication;

/**
 * Main application class for the HelloJME3 game.
 */

public class HelloJME3 extends SimpleApplication {

    public static void main(String[] args) {
        HelloJME3 app = new HelloJME3();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Cubes cubes = new Cubes(assetManager, rootNode);
        cubes.renderCubes(5, 5, 1.0f, 0.1f);
    }
}

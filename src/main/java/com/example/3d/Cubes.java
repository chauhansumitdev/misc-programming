    package com.jme3test.helloworld;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;

/**
 * @author chauhansumitdev
 */
public class Cubes {

    private final AssetManager assetManager;
    private final Node rootNode;

    public Cubes(AssetManager assetManager, Node rootNode) {
        this.assetManager = assetManager;
        this.rootNode = rootNode;
    }

    public void renderCubes(int rows, int cols, float boxSize, float spacing) {
        ColorRGBA[] colors = new ColorRGBA[]{
            ColorRGBA.Blue, ColorRGBA.Red, ColorRGBA.Green, ColorRGBA.Yellow, ColorRGBA.Orange
        };

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Box box = new Box(boxSize / 2, boxSize / 2, boxSize / 2);
                Geometry geom = new Geometry("Cubes are cute", box);

                ColorRGBA color = colors[(row + col) % colors.length];
                Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
                mat.setColor("Color", color);
                geom.setMaterial(mat);

                float x = col * (boxSize + spacing);
                float y = row * (boxSize + spacing);
                geom.setLocalTranslation(x, y, 0);

    
                rootNode.attachChild(geom);
            }
        }
    }
}

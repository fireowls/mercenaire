package fr.fireowls.apigame.world.generator;

import fr.fireowls.apigame.world.World;
import fr.fireowls.apigame.world.generator.noise.Noise;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Grid {

    private float[][] grid;
    private int size;

    public Grid() {
        this(World.DEFAULT_WORLD_SIZE);
    }

    public Grid(int size) {
        this.size = size;
        this.grid = new float[size][size];
    }

    public float[][] applyNoise(Noise noise) {
        noise.transform(grid);
        return grid;
    }


    public int getSize() {
        return size;
    }

    public float[][] getGrid() {
        return grid;
    }

    public File createImage(String path){

        float[][] data = grid;

        BufferedImage image = new BufferedImage(data.length,data[0].length, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < data[0].length; y++)
        {
            for (int x = 0; x < data.length; x++)
            {
                if (data[x][y]>1){
                    data[x][y]=1;
                }
                if (data[x][y]<0){
                    data[x][y]=0;
                }
                Color col=new Color(data[x][y], data[x][y], data[x][y]);
                image.setRGB(x, y, col.getRGB());
            }
        }
        File outputfile = null;
        try {
            // retrieve image
            outputfile = new File(path+".png");
            outputfile.createNewFile();

            ImageIO.write(image, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputfile;
    }
}

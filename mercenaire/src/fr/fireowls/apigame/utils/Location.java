package fr.fireowls.apigame.utils;

import fr.fireowls.apigame.world.World;

public class Location {

    private World world;
    private double x;
    private double y;

    public Location(World world, double x, double y) {
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

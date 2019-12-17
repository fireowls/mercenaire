package fr.fireowls.apigame.entity;

import fr.fireowls.apigame.utils.Location;
import fr.fireowls.apigame.utils.game.GameObject;

public abstract class Localizable extends GameObject {

    protected Location location;

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}

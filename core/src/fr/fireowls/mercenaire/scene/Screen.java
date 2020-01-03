package fr.fireowls.mercenaire.scene;

import fr.fireowls.apigame.utils.game.GameObject;

public abstract class Screen extends GameObject {

    protected Screens screens;
    protected ScreenManager screenManager;


    public ScreenManager getScreenManager() {
        return screenManager;
    }

    public void setScreenManager(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    public void setScreens(Screens screens) {
        this.screens = screens;
    }

    public Screens getScreens() {
        return screens;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Screen && ((Screen) obj).getScreens() == screens;
    }
}

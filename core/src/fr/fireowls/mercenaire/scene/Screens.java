package fr.fireowls.mercenaire.scene;

import java.lang.reflect.InvocationTargetException;

public enum Screens {

    GAME_SCREEN(GameScreen.class);

    private Class<? extends Screen> c;

    private Screens(Class<? extends Screen> c) {
        this.c = c;
    }

    public Class<? extends Screen> getScreenClass() {
        return c;
    }

    public Screen generate() {
        try {
            return getScreenClass().getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

}

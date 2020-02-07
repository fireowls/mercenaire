package fr.fireowls.mercenaire.scene;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.game.GameObject;

import java.util.ArrayList;
import java.util.List;

public class ScreenManager extends GameObject {

    private List<Screen> screens;
    private int current;

    @Override
    protected void onCreate() {
        screens = new ArrayList<>();
        current = 0;
    }

    @Override
    protected void onUpdate(float delta) {
        if (!screens.isEmpty())
            screens.get(current).update(delta);
    }

    @Override
    protected void onDraw(SpriteBatch batch) {
        if (!screens.isEmpty())
            screens.get(current).draw(batch);
    }

    @Override
    protected void onPause() {
        if (!screens.isEmpty())
            screens.get(current).pause();
    }

    @Override
    protected void onResume() {
        if (!screens.isEmpty())
            screens.get(current).resume();
    }

    @Override
    protected void onDispose() {
        screens.forEach(Screen::dispose);
    }

    public void loadScene(Screens addingScreen) {

        if (!screens.isEmpty()) {
            screens.get(current).pause();
        }

        Gdx.app.log("INFO", "Switching screen to " + addingScreen + ".");
        for (int i = 0 ; i < screens.size() ; i++) {
            Screen screen = screens.get(i);
            if (screen.getScreens() == addingScreen) {
                Gdx.app.log("INFO", "Screen loaded.");
                current = i;
                screen.resume();
                return;
            }
        }

        Screen screen = addingScreen.generate();
        assert screen != null;
        screen.setScreenManager(this);
        screen.setScreens(addingScreen);
        screen.create();
        screens.add(screen);
        current = screens.indexOf(screen);
        Gdx.app.log("INFO", "Screen created.");

    }

    public List<Screen> getScreens() {
        return screens;
    }
}

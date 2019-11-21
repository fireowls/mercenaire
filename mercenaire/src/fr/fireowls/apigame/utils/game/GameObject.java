package fr.fireowls.apigame.utils.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GameObject implements Updatable {

    private GameObjectState state;

    private OnCreate onCreate;
    private OnUpdate onUpdate;
    private OnDraw onDraw;
    private OnPause onPause;
    private OnResume onResume;
    private OnDispose onDispose;

    public GameObject() {
        this.state = GameObjectState.WAITING;
    }

    @Override
    public void create() {
        if (state == GameObjectState.WAITING) {
            this.state = GameObjectState.RUNNING;
            this.onCreate.handle();
            onCreate();
        }
    }

    protected abstract void onCreate();

    @Override
    public void update(float delta) {
        if (state == GameObjectState.RUNNING) {
            this.onUpdate.handle(delta);
            onUpdate(delta);
        }
    }

    protected abstract void onUpdate(float delta);

    @Override
    public void draw(SpriteBatch batch) {
        if (state == GameObjectState.RUNNING) {
            this.onDraw.handle(batch);
            onDraw(batch);
        }
    }

    protected abstract void onDraw(SpriteBatch batch);

    @Override
    public void pause() {
        if (state == GameObjectState.RUNNING) {
            this.state = GameObjectState.PAUSE;
            this.onPause.handle();
            onPause();
        }
    }

    protected abstract void onPause();

    @Override
    public void resume() {
        if (state == GameObjectState.PAUSE) {
            this.state = GameObjectState.RUNNING;
            this.onResume.handle();
            onResume();
        }
    }

    protected abstract void onResume();

    @Override
    public void dispose() {
        if (state == GameObjectState.RUNNING || state == GameObjectState.PAUSE) {
            this.state = GameObjectState.STOP;
            this.onDispose.handle();
            onDispose();
        }
    }

    protected abstract void onDispose();

    public void setOnCreate(OnCreate onCreate) {
        this.onCreate = onCreate;
    }

    public void setOnUpdate(OnUpdate onUpdate) {
        this.onUpdate = onUpdate;
    }

    public void setOnDraw(OnDraw onDraw) {
        this.onDraw = onDraw;
    }

    public void setOnPause(OnPause onPause) {
        this.onPause = onPause;
    }

    public void setOnResume(OnResume onResume) {
        this.onResume = onResume;
    }

    public void setOnDispose(OnDispose onDispose) {
        this.onDispose = onDispose;
    }

    public GameObjectState getState() {
        return state;
    }
}

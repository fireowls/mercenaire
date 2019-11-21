package fr.fireowls.apigame.utils.game;

@FunctionalInterface
public interface OnUpdate {
    void handle(float delta);
}

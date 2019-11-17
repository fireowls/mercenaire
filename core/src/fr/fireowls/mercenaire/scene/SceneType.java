package fr.fireowls.mercenaire.scene;

public enum SceneType {

    MAIN_MENU(MainMenuScene.class);

    private Class<? extends Scene> reference;

    private SceneType(Class<? extends Scene> reference) {
        this.reference = reference;
    }

    public Class<? extends Scene> getReference() {
        return reference;
    }

}

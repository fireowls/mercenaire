package fr.fireowls.apigame.item.attribut;

public enum LanguageMeta {

    ENGLISH("item/en-Eng/"),
    FRENCH("item/fr-Fra");

    private String path;

    private LanguageMeta(String s){
        this.path = s;
    }

    public String getPath() {
        return path;
    }
}

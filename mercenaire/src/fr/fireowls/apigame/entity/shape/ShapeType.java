package fr.fireowls.apigame.entity.shape;

public enum ShapeType {

    HUMAN(HumanShape.class);

    private Class<? extends EntityShape> c;

    private ShapeType(Class<? extends EntityShape> c) {
        this.c = c;
    }

    public Class<? extends EntityShape> getC() {
        return c;
    }
}

package fr.fireowls.apigame.utils;

import java.util.HashMap;
import java.util.Map;

public class ItemSelector<E> {

    private Map<E, Float> map;

    public ItemSelector() {
        map = new HashMap<>();
    }

    public void addItem(E item, float frequency) {
        this.map.put(item, frequency);
    }

    public E selectItem() {
        double selected = Math.random();
        return selectItem(selected);
    }

    public E selectItem(double selected) {
        double last = 0;
        for (int i = 0 ; i < map.size() ; i++) {
            float frequency = (Float) map.values().toArray()[i];
            if (selected >= last && selected <= last + frequency) {
                int idx = 0;
                for (Map.Entry<E, Float> entry : map.entrySet()) {
                    if (idx == i) {
                        return entry.getKey();
                    }
                    idx++;
                }
            }
            last += frequency;
        }
        System.out.println(selected);
        return null;
    }

    public Map<E, Float> getMap() {
        return map;
    }
}

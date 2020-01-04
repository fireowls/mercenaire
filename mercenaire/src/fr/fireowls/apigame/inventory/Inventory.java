package fr.fireowls.apigame.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.fireowls.apigame.item.Item;

public class Inventory {

    private Map<Item, Integer> inventory;

    public Inventory(Map<Item,Integer> inv){
        this.inventory = inv;
    }

    public Inventory() {
        this(new HashMap<Item, Integer>());
    }

    public boolean put(int qte,Item item){
        for(Item i:inventory.keySet()){
            if(i.getClass().equals(item.getClass())){
                this.inventory.put(i,qte+inventory.get(i));
                return true;
            }
        }
        this.inventory.put(item,qte);
        return true;
    }

    public boolean remove(int qte,Item item){
        for(Item i:inventory.keySet()){
            if(i.getClass().equals(item.getClass())){
                if((inventory.get(i) - qte) <= 0){
                    this.inventory.remove(i);
                }else {
                    this.inventory.put(i,inventory.get(i)-qte);
                }
                return true;
            }
        }
        return false;
    }

    public void showInventory(){
        for(Item item:inventory.keySet()){
            int qte = inventory.get(item);
            do{
                if(qte > item.getMaxStackValue()){
                    System.out.println(item.getMeta().getName()+" : "+item.getMaxStackValue());
                    qte-=item.getMaxStackValue();
                }
            }while(qte > item.getMaxStackValue());
            System.out.println(item.getMeta().getName()+" : "+qte);
        }
    }

    public boolean hasEnoughtItem(int qte,Item item){
        if(!inventory.containsKey(item)){
            return false;
        }else {
            if((inventory.get(item)-qte) < 0){
                return false;
            }else {
                return true;
            }
        }
    }

    public Item getItemFormName(String name){
        for(Item i:inventory.keySet()){
            if(i.getMeta().getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public List<String> getAllItemName(){
        List<String> items = new ArrayList<>();
        for(Item i:inventory.keySet())
            items.add(i.getMeta().getName());
        return items;
    }

}

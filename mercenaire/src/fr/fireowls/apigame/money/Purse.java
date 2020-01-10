package fr.fireowls.apigame.money;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;

public class Purse {

    private long amount;

    public Purse(long a){
        this.amount = a;
    }

    public Purse(){
        this(0);
    }

    public void addMoney(long value){
        this.amount += value;
    }

    public void subMoney(long value){
        this.amount-= value;
        if(this.amount < 0) this.amount = 0;
    }

    public void sellAllItem(Inventory inv){
        for(Item item:inv.getInventory().keySet()){
            this.amount += item.getPrice() * inv.getInventory().get(item);
        }
    }

    public void sellItem(Item item,int qte){
        this.amount += item.getPrice() * qte;
    }

}

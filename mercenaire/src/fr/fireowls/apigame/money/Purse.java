package fr.fireowls.apigame.money;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.equipment.purse.PurseItem;

public class Purse {

    private long amount;
    private PurseItem purse;

    public Purse(long a,PurseItem purse){
        this.amount = a;
        this.purse = purse;
    }

    public Purse(PurseItem purse){
        this(0,purse);
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
            inv.remove(inv.getInventory().get(item),item);
        }
    }

    public boolean sellItem(Item item,int qte,Inventory inv){
        if((amount+(item.getPrice()*qte)) > purse.getMaxMoneyAmount()){
            return false;
        }else {
            this.amount += item.getPrice() * qte;
            inv.remove(qte,item);
            return true;
        }
    }

    public void showMoney(){
         System.out.println(amount+"/"+purse.getMaxMoneyAmount());
    }
}

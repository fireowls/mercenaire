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

    public boolean sellAllItem(Inventory inv){
       if((inv.getItemsValue() + amount) > purse.getMaxMoneyAmount()){
           return false;
       }else {
           this.amount += inv.getItemsValue();
           inv.removeAllSellable();
           return true;
       }
    }

    public boolean sellItem(Item item,int qte,Inventory inv){
        if(item.getPrice() == 0 || (amount+(item.getPrice()*qte)) > purse.getMaxMoneyAmount()){
            return false;
        }else {
            this.amount += item.getPrice() * qte;
            inv.remove(qte,item);
            return true;
        }
    }

    public void setNewPurseItem(PurseItem item){
        this.purse = item;
    }

    public void showMoney(){
         System.out.println(amount+"/"+purse.getMaxMoneyAmount());
    }
}

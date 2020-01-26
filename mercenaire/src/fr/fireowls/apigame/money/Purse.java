package fr.fireowls.apigame.money;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.equipment.purse.PurseItem;

public class Purse {

    private long amount;
    private PurseItem purse;
    private Sell sell;
    private Buy buy;

    public Purse(long a,PurseItem purse){
        this.amount = a;
        this.purse = purse;
        this.sell = new Sell();
        this.buy = new Buy();
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

    public long getAmount(){
        return amount;
    }

    public PurseItem getPurseItem(){
        return purse;
    }

    public void setNewPurseItem(PurseItem item){
        this.purse = item;
    }

    public void showMoney(){
         System.out.println(amount+"/"+purse.getMaxMoneyAmount());
    }

    public boolean sellAllItem(Inventory inv){
        return sell.sellAllItem(inv,this);
    }

    public boolean sellItem(Item item, int qte, Inventory inv){
        return sell.sellItem(item,qte,inv,this);
    }

    public boolean buyItem(Item item,int qte, Inventory inv){
        return buy.buyItem(item,qte,inv,this);
    }
}

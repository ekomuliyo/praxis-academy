package com.ekomuliyo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unchecked")
public class VendingMachineImpl implements VendingMachine{
    private Inventory<Coin> cashInventory = new Inventory<Coin>();
    private Inventory<Item> itemInventory = new Inventory<Item>();
    private long totalSales;
    private Item currentItem;
    private long currentBalance;

    public VendingMachineImpl(){
        initialize();
    }

    private void initialize(){
        for(Coin c : Coin.values()){
            cashInventory.put(c, 5);
        }

        for(Item i : Item.values()){
            itemInventory.put(i, 5);
        }
    }

    @Override
    public long selectItemAndGetPrice(Item item){
        if(itemInventory.hasItem(item)){
            currentItem = item;
            return currentItem.getPrice();
        }
        throw new SoldOutException("Sold out, please buy another item");
    }

    @Override
    public void insertCoint(Coin coin){
        currentBalance = currentBalance + coin.getDenomination();
        cashInventory.add(coin);
    }

    @Override
    public List<Coin> refund(){
        List<Coin> refund = getChange(currentBalance);
        updateCashInventory(refund);
        currentBalance = 0;
        currentItem = null;
        return refund;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange(){
        Item item = collectItem();
        totalSales = totalSales + currentItem.getPrice();

        List<Coin> change = collectChange();

        return new Bucket<Item, List<Coin>>(item, change);
    }

    private Item collectItem() throws NotSufficientChangeException,
            NotFullPadException{
                if(isFullPaid()){
                    if(hasSufficientChange()){
                        itemInventory.deduct(currentItem);
                        return currentItem;
                    }
                    throw new NotSufficientChangeException("Not Sufficient change in Inventory");
                }
                long remainingBalance = currentItem.getPrice() - currentBalance;
                throw new NotFullPaidException("Price not full paid, remaining : ", remainingBalance);
    }

    private List<Coin> collectChange(){
        long changeAmount = currentBalance - currentItem.getPrice();
        List<Coin> change = getChange(changeAmount);
        updateCashInventory(change);
        currentBalance = 0;
        currentItem = null;
        return change;
    }

    private boolean isFullPaid(){
        if(currentBalance >= currentItem.getPrice()){
            return true;
        }
        return false;
    }

    private boolean hasSufficientChange(){
        return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
    }

    private boolean hasSufficientChangeForAmount(long amount){
        boolean hasChange = true;
        try {
            getChange(amount);
        } catch (NotSufficientChangeException e) {
            return hasChange = false;
        }

        return hasChange;
    }

    private List<Coin> getChange(long amount) throws
            NotSufficientChangeException{
        
        List<Coin> changes = Collections.EMPTY_LIST;

        if (amount > 0) {
            changes = new ArrayList<Coin>();

            long balance = amount;

            while(balance > 0){
                if (balance >= Coin.QUARTER.getDenomination() 
                        && cashInventory.hasItem(Coin.QUARTER)) {
                    changes.add(Coin.QUARTER);
                    balance = balance - Coin.QUARTER.getDenomination();
                    continue;
                }
                else if(balance >= Coin.DIME.getDenomination()
                        && cashInventory.hasItem(Coin.DIME)){
                    changes.add(Coin.DIME);
                    balance = balance - Coin.DIME.getDenomination();
                    continue;
                }
                else if(balance >= Coin.NICKLE.getDenomination()
                        && cashInventory.hasItem(Coin.NICKLE)){
                    changes.add(Coin.NICKLE);
                    balance = balance - Coin.NICKLE.getDenomination();
                    continue;
                }
                else if(balance >= Coin.PENNY.getDenomination()
                        && cashInventory.hasItem(Coin.PENNY)){
                    changes.add(Coin.PENNY);
                    balance = balance - Coin.PENNY.getDenomination();
                    continue;
                }
                else{
                    throw new NotSufficientChangeException("NotSufficientChangeException Please tru another product");
                }
            }
        }
        return changes;
    }

    @Override
    public void reset(){
        cashInventory.clear();
        itemInventory.clear();
        totalSales = 0;
        currentItem = null;
        currentBalance = 0;
    }

    private void updateCashInventory(List<Coin> change){
        for(Coin c : change){
            cashInventory.deduct(c);
        }
    }

    private void printStats(){
        System.out.println("Total sales : " + totalSales);
        System.out.println("Current Item Inventory : "+ itemInventory);
        System.out.println("Current Cash Inventory : "+ cashInventory);
    }
}
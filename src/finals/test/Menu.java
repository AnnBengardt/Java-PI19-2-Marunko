package finals.test;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Item> stopList = new ArrayList<>();

    public Menu(){}

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Item> getStopList() {
        return stopList;
    }

    public Menu addItem(Item item){
        if (!items.contains(item)) {
            items.add(item);
        } else {
            System.out.println(item.getName() + " already exists!");
        }
        return this;
    }

    public Menu deleteItem(Item item){
        if (items.contains(item)){
            items.remove(item);
        } else {
            System.out.println(item.getName() + " doesn't exist!");
        }
        return this;
    }

    public Menu addToStopList(Item item){
        if (items.contains(item) && !stopList.contains(item)){
            stopList.add(item);
        } else {
            System.out.println(item.getName() + " already in a stop-list!");
        }
        return this;
    }

    public void print(){
        for (Item item : items){
            System.out.println(item.toString());
        }
    }

}

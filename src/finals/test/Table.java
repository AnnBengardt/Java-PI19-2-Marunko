package finals.test;

import java.util.HashMap;
import java.util.Map;

public class Table {

    private double orderSum = 0;
    private Map<Item, Integer> orderedItems = new HashMap<>();
    private Boolean closed = false;

    public Table(){}

    public Map addToOrder(Item[] ordered, Menu menu){
        for (Item item : ordered){
            if (!menu.getStopList().contains(item)) {
                orderedItems.compute(item, (k, v) -> v == null ? 1 : v + 1);
            }
        }
        return orderedItems;
    }

    public void closeOrder(){
        for(Map.Entry<Item, Integer> item: orderedItems.entrySet()){
            orderSum += item.getValue() * item.getKey().getPrice();
        }
        closed = true;
        print();
        System.out.println("total: " + orderSum);
        newOrder();
    }

    private void newOrder(){
        orderSum = 0;
        orderedItems.clear();
        closed = false;
    }

    public void print(){
        for (Map.Entry<Item, Integer> item: orderedItems.entrySet()){
            System.out.println("Ordered: " + item.getKey() + " pieces: " + item.getValue());
        }
    }


}

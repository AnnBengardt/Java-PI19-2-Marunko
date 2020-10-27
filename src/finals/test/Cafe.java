package finals.test;

public class Cafe {

    public static void main(String[] args){
        Menu menu = new Menu();
        Item beef = new Item("Beef", 200, "piece", 100,
                "Beef, vegetables", "kitchen");
        Item soup = new Item("Soup", 150, "bowl", 200,
                "Vegetables, chicken", "kitchen");
        Item tea = new Item("Tea", 70, "cup", 120, "Tea, lemon", "bar");
        menu.addItem(beef);
        menu.addItem(soup);
        menu.addItem(tea);
        menu.addItem(tea);
        menu.print();
        menu.deleteItem(beef);
        menu.deleteItem(beef);
        menu.addItem(beef);
        menu.addToStopList(tea);
        Table table = new Table();
        Item[] items = {soup, beef, tea};
        table.addToOrder(items, menu);
        table.closeOrder();
    }

}

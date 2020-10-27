package finals.test;

import java.util.Arrays;

public class Item {

    private String name;
    private double price;
    private String portion;
    private double inPortion;
    private String components;
    private String place;

    public Item(String name, double price, String portion, double inPortion, String components, String place){
        this.name = name;
        this.components = components;
        this.price = price;
        this.portion = portion;
        this.inPortion = inPortion;
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public double getInPortion() {
        return inPortion;
    }

    public String getPortion() {
        return portion;
    }

    public String getComponents() {
        return components;
    }

    public String getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return   name +
                " price=" + price +
                ", portion='" + portion + '\'' +
                ", in Portion=" + inPortion +
                ", components=" + components+
                ", place='" + place + '\'';
    }
}

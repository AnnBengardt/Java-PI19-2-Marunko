import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Garage {
    private int max_amount;
    private int cars_total;
    Map<String, Integer> cars_types = new HashMap<String, Integer>();

    public Garage(int max){
        this.max_amount = max;
    }

    public int getMax_amount() {
        return max_amount;
    }

    public int getCars_total() {
        return cars_total;
    }

    public void add(Car car){
        if (cars_total < max_amount){
            cars_total ++;
            cars_types.compute(car.getClass().getName(), (k, v)->v==null?1:v+1);
            System.out.println("Car added");
        }
        else {
            System.out.println("Not enough space");
        }
    }

    public void get_by_amount(){
        ArrayList<Map.Entry<String, Integer>> array = new ArrayList<>(cars_types.entrySet());
        array.sort((obj1, obj2) -> Integer.compare(obj1.getValue(), obj2.getValue()));
        for (Map.Entry<String, Integer> item : array) {
            System.out.printf("Car: %s - amount: %d    ", item.getKey(), item.getValue());
        }
    }

}

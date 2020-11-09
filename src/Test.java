import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        Sedan car1 = new Sedan("Black", 250, "manual", 1000);
        Sedan car2 = new Sedan("White", 300, "automatic", 2000);
        Sedan car3 = new Sedan("Blue", 280, "automatic", 1800);
        car1.start();
        System.out.println(car1.getCurSpeed());
        car1.stop();
        System.out.println(car1.getCurSpeed());
        Garage gar = new Garage(2);
        gar.add(car1);
        gar.add(car2);
        gar.add(car3);
        gar.get_by_amount();
        TempConverter tempConverter = new TempConverter(22, "C");
        System.out.println("");
        System.out.println(tempConverter.convertCtoF());
        System.out.println(tempConverter.convertCtoK());
        System.out.println(tempConverter.convertFtoC());
        int[] values = {1, 4, 6, 7, 9, 14, 19, 21};
        Recursion recursion = new Recursion();
        System.out.println(recursion.printNumbers(7));
        System.out.println(recursion.forSearch(14, values));
        System.out.println(recursion.binarySearch(values, 6, 0, 7));
        recursion.compareSpeed(560001);
        System.out.println(recursion.solver(0, 10));
    }
}

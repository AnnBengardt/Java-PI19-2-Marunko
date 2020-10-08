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
    }
}

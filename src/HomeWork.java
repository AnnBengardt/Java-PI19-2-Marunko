public class HomeWork {

// ДЗ на 10.09

    public static void main(String[] args) {
        task1();
        System.out.println(task2());
        task3();
        task4(40, 50);
        System.out.println(task5());
        task6(6);
        task7(5920);
        task8(34);
        System.out.println(task9(21));
        System.out.println(task9(45));
        System.out.println(task9(10));
        System.out.println(task10(7, 5));
        System.out.println(task11(7, 5));
        System.out.println(task12(9, 4, 7, 6));
    }

    static void task1() {
        System.out.println("Hello World");
    }

    static int task2() {
        int x = 5;
        return x;
    }

    static void task3() {
        int x = 0;
        x += 1;
        x = ++x;
        int y = x++;
        System.out.println(x);
    }

    static void task4(int x, int y) {
        var z = x;
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);
        x = y + x;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }

    static double task5() {
        int x = 3;
        int y = 4;
        double z = Math.sqrt(x*x + y*y);
        return z;
    }

    static void task6(int x) {
        int res = x % 10;
        System.out.println(res);
    }

    static void task7(int x) {
        x %= 100;
        x /= 10;
        System.out.println(x);
    }

    static void task8(int x) {
        x /= 10;
        System.out.println(x);
    }

    static int task9(int x) {
        return x - 21;
    }

    static double task10(int x, int y) {
        return (x + y) / 2;
    }

    static double task11(int x, int y) {
        return Math.sqrt(x*y);
    }

    static double task12(double a, double b, double c, double d) {
        return Math.sqrt((c-a)*(c-a) + (d-b)*(d-b));
    }
}

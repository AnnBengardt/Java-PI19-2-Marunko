public class Recursion {

    StringBuilder string = new StringBuilder();

    public String printNumbers(int n){
        if (n == 0)
            return "";
        else
            printNumbers(n-1);

        string.append(n + " ");
        return string.toString();
    }

    public Boolean forSearch(int n, int[] values){
        for (int i = 0; i < values.length; i++)
            if (n == values[i])
                return true;
        return false;
    }

    public Boolean binarySearch(int[] sortedArray, int n, int first, int last){
        if (last>=first) {
            int middle = (first + last) / 2;
            if (n == sortedArray[middle])
                return true;
            if (n > sortedArray[middle])
                return binarySearch(sortedArray, n, middle + 1, last);
            else
                return binarySearch(sortedArray, n, first, middle - 1);
        }
        else
            return false;
    }

    public void compareSpeed(int x) {
        long startTime, forTime, binaryTime;
        final int N = 100000000;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }
        startTime = System.currentTimeMillis();
        System.out.println(this.forSearch(x, arr));
        forTime = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        System.out.println(this.binarySearch(arr, x, 0, N));
        binaryTime = System.currentTimeMillis() - startTime;
        System.out.println(forTime);
        System.out.println(binaryTime);
    }

    public static double function(double x){
         double result = Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
         return result;
    }

    public double solver(double first, double last){
        double middle = (first + last) / 2;
        double epsilon = 0.001;
        if ((last - first) >= epsilon) {
            if (function(first) * function(middle) < 0) {
                return solver(first, middle);
            } else
                return solver(middle, last);
        } else
            return first;
    }


}

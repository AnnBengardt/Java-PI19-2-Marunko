import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // task 2

        double[] arr = {3, 3, 3};
        double[] arr1 = {2, 4, 6};
        TaskTwoVectors obj = new TaskTwoVectors(arr);
        System.out.println(obj.scalar_mult(arr1));
        System.out.println(Arrays.toString(obj.vector_mult(arr1).getCoord()));
        System.out.println(Arrays.toString(obj.sub(arr1).getCoord()));
        System.out.println(obj.self_vec_length());
        System.out.println(TaskTwoVectors.vec_length(arr1));
        System.out.println(obj.angle(arr1));
        System.out.println(Arrays.toString(obj.summ(arr1).getCoord()));
        System.out.println(Arrays.deepToString(obj.random_vec(5)));

        // task 5

        int[] arr2 = {2, 6, 4};
        int[] arr3 = {1, 2, 8};
        TaskFiveRandomizer obj1 = new TaskFiveRandomizer(arr2, arr3);
        obj1.convert();
        System.out.println(obj1.get());
    }
}

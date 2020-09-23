import java.util.Arrays;

public class MatrixExc {

    public static void main(String[] args){
        double[][] input = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        double[][] input2 = {{1, -1}, {2, 0}, {3, 0}};
        double[][] input3 = {{1, 1}, {2, 0}};
        Matrix m = new Matrix(input);
        Matrix m3 = new Matrix(input2);
        Matrix m4 = new Matrix(input3);
        System.out.println(Arrays.deepToString(m.getMatrix()));
        Matrix m2 = new Matrix(input);
        System.out.println(Arrays.deepToString(m.sum(m2).getMatrix()));
        System.out.println(Arrays.deepToString(m.sub(m2).getMatrix()));
        System.out.println(Arrays.deepToString(m.num_multy(10).getMatrix()));
        System.out.println(Arrays.deepToString(m.mat_multy(m2).getMatrix()));
        System.out.println(Arrays.deepToString(m3.mat_multy(m4).getMatrix()));
        System.out.println(Arrays.deepToString(m.transp().getMatrix()));
        System.out.println(Arrays.deepToString(m4.pow(3).getMatrix()));
    }

}

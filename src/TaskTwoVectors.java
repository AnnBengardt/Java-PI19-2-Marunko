import java.util.concurrent.ThreadLocalRandom;

public class TaskTwoVectors {

    // Д/З на 15.09

    private double coord[] = new double[3];
    double[] coord1 = new double[3];

    public TaskTwoVectors(double[] coord){
        this.coord = coord;
    }

    public double[] getCoord() {
        return coord;
    }

    public double self_vec_length(){
        double len = Math.sqrt(Math.pow(coord[0], 2) + Math.pow(coord[1], 2) + Math.pow(coord[2], 2));
        return len;
    }

    public static double vec_length(double[] coord){
        double len = Math.sqrt(Math.pow(coord[0], 2) + Math.pow(coord[1], 2) + Math.pow(coord[2], 2));
        return len;
    }

    public double scalar_mult(double[] coord1){
        return coord[0]*coord1[0] + coord[1]*coord1[1] + coord[2]*coord1[2];
    }

    public TaskTwoVectors vector_mult(double[] coord1){
        double[] result_array = {coord[1]*coord1[2] - coord[2]*coord1[1], coord[2]*coord1[0] - coord[0]*coord1[2], coord[0]*coord1[1] - coord[1]*coord1[0]};
        TaskTwoVectors result_vector = new TaskTwoVectors(result_array);
        return result_vector;
    }

    public double angle(double[] coord1){
        return scalar_mult(coord1) / (self_vec_length()*vec_length(coord1));
    }

    public TaskTwoVectors summ(double[] coord1){
        double[] result_array = {coord[0] + coord1[0], coord[1] + coord1[1], coord[2] + coord1[2]};
        TaskTwoVectors result_vector = new TaskTwoVectors(result_array);
        return result_vector;
    }

    public TaskTwoVectors sub(double[] coord1){
        double[] result_array = {coord[0] - coord1[0], coord[1] - coord1[1], coord[2] - coord1[2]};
        TaskTwoVectors result_vector = new TaskTwoVectors(result_array);
        return result_vector;
    }

    public double[][] random_vec(int N){
        int min = -1000;
        int max = 1000;
        double[][] res = new double[N][3];
        for (int i = 0; i<N; i++) {
            double random0 = ThreadLocalRandom.current().nextDouble(min, max);
            double random1 = ThreadLocalRandom.current().nextDouble(min, max);
            double random2 = ThreadLocalRandom.current().nextDouble(min, max);
            double[] vector = {random0, random1, random2};
            res[i] = vector;
        }
        return res;
    }


}

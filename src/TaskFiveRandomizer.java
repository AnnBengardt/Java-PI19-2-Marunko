public class TaskFiveRandomizer {

    // Д/З 15.09

    private int[] values;
    private int[] frequency;
    private int[] new_values;

    public TaskFiveRandomizer(int[] values, int[] frequency){
        this.values = values;
        this.frequency = frequency;
    }

    public int[] convert(){
        int size = 0;
        for (int freq : frequency){
            size += freq;
        }

        new_values = new int[size];
        int index = 0;

        for (int i=0; i<frequency.length; i++){
            for (int j=0; j<frequency[i]; j++){
                new_values[index] = values[i];
                index += 1;
            }
        }
        return new_values;

    }

    public int get(){
        int random = (int) (Math.random() * (new_values.length - 1));
        return new_values[random];
    }

}

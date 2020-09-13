public class TaskThreeBox extends Shape{

    private double volume;

    public TaskThreeBox(double volume){
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public boolean addShape(Shape shape){
        boolean success = false;
        if (volume - shape.getVolume() >= 0){
            success = true;
            volume -= shape.getVolume();
            System.out.println("addition successful");
        } else {
            System.out.println("not enough space!");
        }
        return success;
    }
}


public class Cube extends Square{
    private double volume;

    public Cube(double height){
        super(height);

        volume = volume();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public double volume(){
        return Math.pow(getHeight(), 3);
    }

}

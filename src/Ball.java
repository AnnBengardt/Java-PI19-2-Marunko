public class Ball extends SolidOfRevolution{

    private double volume;

    public Ball(double radius){
        super(radius);

        volume = volume();

    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double volume() {
        return 4/3*getRadius()*Math.PI;
    }
}

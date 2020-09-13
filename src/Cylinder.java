
public class Cylinder extends SolidOfRevolution{

    private double volume;
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    @Override
    public double volume() {
        return height*getRadius()*getRadius()*Math.PI;
    }
}

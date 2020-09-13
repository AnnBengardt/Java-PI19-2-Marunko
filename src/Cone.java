
public class Cone extends SolidOfRevolution{

    private double volume;
    private double height;

    public Cone(double radius, double height){
        super(radius);
        this.height = height;
        volume = volume();

    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double volume() {
        return height*(Math.PI*getRadius()*getRadius() + Math.PI*getRadius()*Math.sqrt(getRadius()*getRadius() + height*height))*1/3;
    }
}

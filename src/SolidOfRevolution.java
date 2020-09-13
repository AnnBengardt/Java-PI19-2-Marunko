public abstract class SolidOfRevolution extends Shape{
    private double radius;

    public SolidOfRevolution(double radius){
        this.radius = radius;
    }

    public abstract double volume();

    public double getRadius() {
        return radius;
    }

}

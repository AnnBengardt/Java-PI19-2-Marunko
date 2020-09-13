public abstract class Square extends Shape{
    private double height;

    public Square(double height){
        this.height = height;

    }

    public abstract double volume();

    public double getHeight() {
        return height;
    }
}

public class Pyramid extends Square{
    private double volume;
    private double side;

    public Pyramid(double height, double side){
        super(height);
        this.side = side;

        volume = volume();
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double volume() {
        return 1/3*getHeight()*side*side;
    }
}

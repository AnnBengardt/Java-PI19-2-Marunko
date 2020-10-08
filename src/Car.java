public abstract class Car {
    private String color;
    private double maxSpeed;
    private String gearbox;
    private double curSpeed;
    private double price;


    public Car(String color, double maxSpeed, String gearbox, double price){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearbox = gearbox;
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public String getGearbox() {
        return gearbox;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void accelerate();
}

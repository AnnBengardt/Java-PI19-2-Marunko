public class Sedan extends Car {

    private double curSpeed;
    private double acceleration;


    public Sedan(String color, double maxSpeed, String gearbox, double price){
        super(color, maxSpeed, gearbox, price);
        this.curSpeed = 0;
        this.acceleration = maxSpeed / 100;
    }

    @Override
    public void accelerate() {
        curSpeed = curSpeed + acceleration;
    }

    @Override
    public void start() {
        for (int i = 0; i < getMaxSpeed(); i+=5){
            if (curSpeed < getMaxSpeed()){
                accelerate();
            }
        }
    }

    @Override
    public void stop() {
        curSpeed = 0;
    }

    public double getCurSpeed() {
        return curSpeed;
    }

    @Override
    public double getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getGearbox() {
        return super.getGearbox();
    }
}

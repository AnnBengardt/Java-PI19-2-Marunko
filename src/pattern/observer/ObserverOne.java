package pattern.observer;

public class ObserverOne implements Observer{
    @Override
    public void changeAlert(Observed observedString) {
        System.out.println("Changed to: " + observedString.toString());
    }
}

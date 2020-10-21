package pattern.observer;

public interface Observed {
    void setObserver(Observer observer);
    void notifyObserver();
}

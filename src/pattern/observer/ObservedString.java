package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservedString implements Observed{

    private List<Observer> observers = new ArrayList<Observer>();
    private StringBuilder stringBuilder;

    public ObservedString(){
        stringBuilder = new StringBuilder();
    }

    public void setObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObserver(){
        if (!observers.isEmpty()) {
            for (Observer observer : observers) {
                observer.changeAlert(this);
            }
        }
    }

    public ObservedString append(Object obj) {
        stringBuilder.append(obj);
        notifyObserver();
        return this;
    }

    public ObservedString delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObserver();
        return this;
    }

    public ObservedString deleteCharAt(int ind) {
        stringBuilder.deleteCharAt(ind);
        notifyObserver();
        return this;
    }

    public ObservedString insert(int start, String str) {
        stringBuilder.insert(start, str);
        notifyObserver();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}

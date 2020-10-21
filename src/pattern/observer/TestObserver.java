package pattern.observer;

public class TestObserver {

    public static void main(String[] args){
        ObservedString observedString = new ObservedString();
        ObserverOne observerOne = new ObserverOne();
        observedString.setObserver(observerOne);
        observedString.append("hello!");
        ObserverOne observerTwo = new ObserverOne();
        observedString.setObserver(observerTwo);
        observedString.insert(5, ", world");
    }

}

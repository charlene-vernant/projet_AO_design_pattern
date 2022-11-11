import java.util.ArrayList;
import java.util.List;

public class Quantity {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
        if (state < 5){
            warnAllObservers();
        }
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void warnAllObservers() {
        for (Observer observer : observers) {
            observer.warning();
        }
    }
}
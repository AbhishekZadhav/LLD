package Observable;

import Observer.Observer;

public interface Observable {
    void add(Observer theObserver);
    void remove(Observer theObserver);
    void notifyObservers();
    void setState(String state);
}

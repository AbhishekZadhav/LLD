package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone implements Observable{
    List<Observer> oberservers;
    private String state;
    public SmartPhone(){
        this.state = "OutOfStock";
        oberservers = new ArrayList<Observer>();
    }
    @Override
    public void add(Observer theObserver) {
        oberservers.add(theObserver);
    }

    @Override
    public void remove(Observer theObserver) {
        if(oberservers!= null){
            oberservers.remove(theObserver);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer theObserver: oberservers){
            System.out.println(theObserver.update());
        }
    }

//    @Override
//    public void setState() {
//
//    }

    public String getState() {
        return state;
    }
    @Override
    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
}

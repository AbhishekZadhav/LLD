package Buttons;

import Misc.Request;
import Strategy.ExternalStrategy;

public class ExternalButton implements Button{
    ExternalStrategy strategy;
    public ExternalButton(ExternalStrategy strategy){
        this.strategy = strategy;
    }
    public void pressButton(Request req) {
        new Thread(() -> submit(req)).start();
    }

    @Override
    public void submit(Request req) {
        while(!strategy.getElevator(req)){}
    }
}

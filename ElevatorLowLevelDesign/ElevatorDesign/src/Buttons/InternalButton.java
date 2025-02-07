package Buttons;

import Elevator.ElevatorController;
import Misc.Request;

import static Enums.Direction.*;

public class InternalButton implements Button{
    ElevatorController controller;
    public InternalButton(ElevatorController controller){
        this.controller = controller;
    }
    public void pressButton(int floor) {
        int currentFloor = controller.getFloor();
        Request req = (currentFloor>floor)?new Request(DOWN,
                floor):new Request(UP, floor);
        new Thread(() -> submit(req)).start();
    }

    @Override
    public void submit(Request req) {
        controller.submitRequest(req);
    }
}

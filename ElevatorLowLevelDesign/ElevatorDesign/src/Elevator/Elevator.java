package Elevator;

import Buttons.InternalButton;
import Enums.Direction;
import Enums.Status;

public class Elevator {
    int id;
    ElevatorController controller;
    Status status;
    Direction dir;
    int floor;
    InternalButton theButton;
    Elevator(ElevatorController controller, Status status, Direction dir, int floor, int id){
        this.controller = controller;
        this.status = status;
        this.dir = dir;
        this.floor = floor;
        this.id = id;
        theButton = new InternalButton(controller);
    }
    public InternalButton getButton(){
        return theButton;
    }

}

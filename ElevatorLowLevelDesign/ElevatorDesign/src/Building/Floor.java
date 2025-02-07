package Building;

import Buttons.ExternalButton;
import Elevator.ElevatorController;
import Enums.Direction;
import Misc.Request;

import java.util.List;

public class Floor {
    int id;
    ExternalButton theButton;
    public Floor(ExternalButton theButton){
        this.theButton = theButton;
    }
    public void pressButton(Direction dir){
       theButton.pressButton(new Request(dir, id));
    }
}

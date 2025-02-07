package Strategy;

import Elevator.ElevatorController;
import Enums.Direction;
import Misc.Request;

import java.util.List;

import static Enums.Status.*;

public class AllElevatorExternalStrategy implements ExternalStrategy{
    List<ElevatorController> controllers;
    public AllElevatorExternalStrategy(List<ElevatorController> controllers){
        this.controllers = controllers;
    }

    @Override
    public boolean getElevator(Request req) {
        boolean isRequested = false;
        for(ElevatorController controller:controllers){
            if(controller.getStatus()==Idle ||
                    (controller.getDirection()==req.dir && req.dir== Direction.UP && controller.getFloor()< req.floor) ||
                    (controller.getDirection()==req.dir && req.dir== Direction.DOWN && controller.getFloor()>req.floor)
            ){
                controller.submitRequest(req);
                isRequested = true;
            }
        }
        return isRequested;
    }
}

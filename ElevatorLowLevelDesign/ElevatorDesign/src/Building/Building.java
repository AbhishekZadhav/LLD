package Building;

import Buttons.ExternalButton;
import Buttons.InternalButton;
import Elevator.ElevatorController;
import Elevator.ElevatorFactory;
import Enums.Direction;
import Misc.Request;
import Strategy.StrategyManager;

import java.util.ArrayList;
import java.util.List;

public class Building {
    int id =0;
    List<ElevatorController> controllers;
    public List<Floor> floors;
    ElevatorFactory theFactory;
    public Building(){
        theFactory = new ElevatorFactory(this);
        this.controllers = theFactory.addElevators(10);
        floors = new ArrayList<Floor>();
        addFloors(10);
    }
    void addLifts(int amount){
        theFactory.addElevators(amount);
    }
    void addFloors(int amount){
        for(int i=0; i<amount; i++){
            floors.add(new Floor(new ExternalButton(StrategyManager.getStrategy(
                    "", controllers))));
        }
    }
    public boolean getLift(int floorNumber, Direction dir){
        Floor theFloor = floors.get(floorNumber);
        theFloor.pressButton(dir);
        return true;
    }
    public boolean selectFloor(int liftId , int destinationFloor){
        InternalButton theButton = controllers.get(liftId).getButton();
        theButton.pressButton(destinationFloor);
        return true;
    }
}

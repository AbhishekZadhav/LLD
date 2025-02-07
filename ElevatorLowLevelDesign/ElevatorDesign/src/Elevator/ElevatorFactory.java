package Elevator;

import Building.Building;

import java.util.ArrayList;
import java.util.List;

public class ElevatorFactory {
    static List<ElevatorController> controllers;
    static Building theBuilding;
    private static int id= 0;
    public ElevatorFactory(Building theBuilding){
        controllers = new ArrayList<ElevatorController>();
        this.theBuilding = theBuilding;
    }
    public static List<ElevatorController> addElevators(int amount){
        for(int i=0; i<amount; i++){
            controllers.add(new ElevatorController(id++, theBuilding));
        }
        return controllers;
    }
    static List<ElevatorController> getElevators(){
        return controllers;
    }
}

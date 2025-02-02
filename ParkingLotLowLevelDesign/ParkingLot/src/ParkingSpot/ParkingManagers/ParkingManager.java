package ParkingSpot.ParkingManagers;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

import java.util.List;

public abstract class ParkingManager {
    List<ParkingSpot> available;
    List<ParkingSpot> occupied;
    ParkingManager(List<ParkingSpot> available){
        this.available = available;
    }
    public ParkingSpot occupySpot(Vehicle theVehicle){
        int i=0;
        while(i<available.size() && !available.get(i).occupy(theVehicle)){
            i++;
        }
        ParkingSpot theSpot = available.get(i);
        available.remove(theSpot);
        occupied.add(theSpot);
        return theSpot;
    }
    public ParkingSpot deOccupySpot(ParkingSpot theSpot){
        theSpot.deOccupy();
        available.add(theSpot);
        occupied.remove(theSpot);
        return theSpot;
    }
    public int getAvailableSize(){
        return available.size();
    }
    public int getOccupiedSize(){
        return occupied.size();
    }
}

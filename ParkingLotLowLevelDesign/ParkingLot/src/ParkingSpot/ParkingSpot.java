package ParkingSpot;

import Vehicle.Vehicle;

public abstract class ParkingSpot {
    boolean isOccupied = false;
    Vehicle theVehicle;
    public abstract String getType();
    public abstract int getRate();
    public synchronized boolean isOccupied() {
        return isOccupied;
    }
    public synchronized boolean occupy(Vehicle theVehicle) {
        if(!isOccupied()){
            this.theVehicle = theVehicle;
            return isOccupied = true;
        }
        else{
            return false;
        }
    }
    public boolean deOccupy(){
        isOccupied = false;
        theVehicle = null;
        return true;
    }
}

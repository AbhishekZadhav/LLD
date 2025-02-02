package Factories;

import Base.Cruiser;
import Base.OffRoading;
import Base.Sport;
import Base.Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(String input){
        switch (input) {
            case "Cruiser":
                return new Cruiser();
            case "OffRoad":
                return new OffRoading();
            default:
                return new Sport();
        }
    }
}

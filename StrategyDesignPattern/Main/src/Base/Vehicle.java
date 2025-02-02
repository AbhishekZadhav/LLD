package Base;

import Strategies.DriveStrategy;

public class Vehicle {
    DriveStrategy driveType;
    Vehicle(DriveStrategy driveType){
        this.driveType = driveType;
    }
    public String driveType(){
        return driveType.drive();
    }
}

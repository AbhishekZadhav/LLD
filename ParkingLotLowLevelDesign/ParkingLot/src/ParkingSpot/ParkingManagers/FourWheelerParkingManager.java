package ParkingSpot.ParkingManagers;

import ParkingSpot.*;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingManager extends ParkingManager{
    static FourWheelerParkingManager theManager;
    public static synchronized FourWheelerParkingManager getManager() {
        if (theManager == null) {
            theManager = new FourWheelerParkingManager(createSpots());
        }
        return theManager;
    }
    private FourWheelerParkingManager(List<ParkingSpot> list) {
        super(list);
    }
    public static  List<ParkingSpot> createSpots() {
        List<ParkingSpot> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new FourWheelerSpot());
        }
        return list;
    }
}

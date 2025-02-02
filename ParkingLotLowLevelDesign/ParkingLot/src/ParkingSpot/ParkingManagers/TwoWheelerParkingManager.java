package ParkingSpot.ParkingManagers;

import ParkingSpot.ParkingSpot;
import ParkingSpot.TwoWheelerSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingManager extends ParkingManager{
    static TwoWheelerParkingManager theManager;
    public static synchronized TwoWheelerParkingManager getManager() {
        if (theManager == null) {
            theManager = new TwoWheelerParkingManager(createSpots());
        }
        return theManager;
    }
    private TwoWheelerParkingManager(List<ParkingSpot> list) {
        super(list);
    }
    public static  List<ParkingSpot> createSpots() {
        List<ParkingSpot> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new TwoWheelerSpot());
        }
        return list;
    }
}

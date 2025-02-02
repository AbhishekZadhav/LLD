package ParkingSpot.ParkingManagers;

public class ParkingManagerFactory {
    public static ParkingManager getManager(String type){
        switch (type){
            case "TwoWheeler":
                return TwoWheelerParkingManager.getManager();
            default:
                return FourWheelerParkingManager.getManager();
        }
    }
}

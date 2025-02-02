package ParkingSpot;

public class FourWheelerSpot extends ParkingSpot{
    @Override
    public String getType() {
        return "FourWheeler";
    }
    @Override
    public int getRate(){
        return 20;
    }
}

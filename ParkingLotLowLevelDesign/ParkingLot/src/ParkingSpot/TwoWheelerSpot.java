package ParkingSpot;

public class TwoWheelerSpot extends ParkingSpot{
    @Override
    public String getType() {
        return "TwoWheeler";
    }
    @Override
    public int getRate(){
        return 10;
    }
}

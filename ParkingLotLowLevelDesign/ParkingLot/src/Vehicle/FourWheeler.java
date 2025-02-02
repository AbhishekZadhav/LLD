package Vehicle;

public class FourWheeler extends Vehicle{
    public FourWheeler(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public String getType(){
        return "FourWheeler";
    }
}

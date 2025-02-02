package Vehicle;

public class TwoWheeler extends Vehicle{
    public TwoWheeler(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public String getType() {
        return "2 Wheeler";
    }
}

import Base.Cruiser;
import Base.Vehicle;
import Factories.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle offroad = VehicleFactory.createVehicle("OffRoad");
        System.out.println(offroad.driveType());
    }
}
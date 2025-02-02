package Vehicle;
import Ticket.*;
public abstract class Vehicle {
    String vehicleNumber;
    Ticket theTicket;
    public Vehicle(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public abstract String getType();
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public Ticket setTicket(Ticket theTicket){
        return this.theTicket = theTicket;
    }
    public Ticket getTicket(){
        return this.theTicket;
    }
}

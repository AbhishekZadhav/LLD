package Ticket;
import java.time.LocalDateTime;
import Vehicle.Vehicle;
import ParkingSpot.*;
import java.time.Duration;
public class Ticket {
    Vehicle theVehicle;
    int id;
    ParkingSpot theSpot;
    Double time;
    LocalDateTime currentDateTime;
    public Ticket(Vehicle theVehicle, int id, ParkingSpot theSpot){
        this.currentDateTime = LocalDateTime.now();
        this.theVehicle = theVehicle;
        this.id = id;
        this.theSpot = theSpot;
    }

    public Vehicle getVehicle() {
        return theVehicle;
    }
    public int getId() {
        return id;
    }
    public ParkingSpot getSpot() {
        return theSpot;
    }
    public int getRate() {
        //to implement this
        int rate = theSpot.getRate();
        Duration duration = Duration.between(this.currentDateTime, LocalDateTime.now());
        int total = (int)(duration.toHours()*rate);
        return total;
    }
}

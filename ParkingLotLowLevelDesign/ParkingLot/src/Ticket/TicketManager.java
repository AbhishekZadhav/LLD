package Ticket;
import ParkingSpot.*;
import Vehicle.Vehicle;

public class TicketManager {
    static int id = 0;
    public static Ticket getNewTicket(Vehicle theVehicle, ParkingSpot theSpot){
        return new Ticket(theVehicle,id++, theSpot);
    }
}

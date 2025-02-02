package Gates.EntranceGates;

import ParkingSpot.ParkingManagers.ParkingManager;
import ParkingSpot.ParkingManagers.ParkingManagerFactory;
import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;
import Ticket.*;
public class EntranceGate {
    final int gateNumber;
    EntranceGate(int gateNumber){
        this.gateNumber = gateNumber;
    }
    public Ticket generateTicket(Vehicle theVehicle){
        ParkingManager theManager = ParkingManagerFactory.getManager(theVehicle.getType());
        ParkingSpot theSpot = theManager.occupySpot(theVehicle);
        Ticket theTicket = TicketManager.getNewTicket(theVehicle, theSpot);
        return theVehicle.setTicket(theTicket);
    }
}

package Gates.ExitGates;
import ParkingSpot.ParkingManagers.ParkingManager;
import ParkingSpot.ParkingManagers.ParkingManagerFactory;
import Vehicle.*;
import Ticket.*;
public class ExitGate {
    int exitGateNumber;
    ExitGate(int exitGateNumber){
        this.exitGateNumber = exitGateNumber;
    }
    public int getTotal(Vehicle theVehicle){
        Ticket theTicket = theVehicle.getTicket();
        return theTicket.getRate();
    }
    public boolean receivePayment(Ticket theTicket, int amount){
        if(amount== theTicket.getRate()){
            Vehicle theVehicle = theTicket.getVehicle();
            ParkingManager theManager = ParkingManagerFactory.getManager(theVehicle.getType());
            theManager.deOccupySpot(theTicket.getSpot());
            return true;
        }
        else{
            return false;
        }
    }
}

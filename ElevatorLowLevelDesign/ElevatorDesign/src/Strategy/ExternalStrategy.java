package Strategy;

import Elevator.ElevatorController;
import Misc.Request;

import java.util.List;

public interface ExternalStrategy {
    boolean getElevator(Request req);
}

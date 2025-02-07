package Strategy;

import Elevator.*;

import java.util.List;

public class StrategyManager {
    public static ExternalStrategy getStrategy(String input, List<ElevatorController> controllers){
        switch (input){
            case "all":
                return new AllElevatorExternalStrategy(controllers);
            default:
                return new AllElevatorExternalStrategy(controllers);
        }
    }
}

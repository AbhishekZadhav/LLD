package Gates.ExitGates;

public class ExitGateManager {
    static int exitGateNumber = 0;
    public ExitGate getGate(){
        return new ExitGate(exitGateNumber++);
    }
}

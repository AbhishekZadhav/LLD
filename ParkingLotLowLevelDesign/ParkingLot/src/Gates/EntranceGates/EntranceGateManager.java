package Gates.EntranceGates;

public class EntranceGateManager {
    static int gateNumber = 0;
    public static EntranceGate getGate(){
        return new EntranceGate(gateNumber++);
    }
}

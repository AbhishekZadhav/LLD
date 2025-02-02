package Base;

import Strategies.OffRoad;

public class OffRoading extends Vehicle{
    public OffRoading() {
        super(new OffRoad());
    }
}

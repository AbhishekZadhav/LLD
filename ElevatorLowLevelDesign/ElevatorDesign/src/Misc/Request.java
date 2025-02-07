package Misc;

import Enums.Direction;

public class Request {
    public Direction dir;
    public int floor;
    public Request(Direction dir, int floor){
        this.dir = dir;
        this.floor = floor;
    }
}

package Elevator;

import Buttons.InternalButton;
import Enums.Direction;
import Enums.Status;
import Misc.Request;
import Building.*;
import java.util.PriorityQueue;

public class ElevatorController {
    Status status;
    Direction dir = null;
    int floor;
    Elevator theElevator;
    PriorityQueue<Request> upPq;
    PriorityQueue<Request> downPq;
    Building theBuilding;
    int id;
    public ElevatorController(int id, Building theBuilding){
        this.theBuilding = theBuilding;
        status = Status.Idle;
        floor = 0;
        this.id = id;
        theElevator = new Elevator(this, status, dir, floor, id);
        upPq = new PriorityQueue<>();
        downPq = new PriorityQueue<>((req1, req2)->Integer.compare(req2.floor, req1.floor));
    }
    private void updateFloor(int floor){
        this.floor = floor;
        theElevator.floor = floor;
    }
    private void updateDirection(Direction dir){
        this.dir = dir;
        theElevator.dir = dir;
        theElevator.status = Status.Moving;
    }
    public InternalButton getButton(){
        return theElevator.getButton();
    }
    public void submitRequest(Request req){
        if(theBuilding.floors.size()>req.floor){
            System.out.println("Invalid request");
            return;
        }
        if(req.dir==Direction.DOWN){
            downPq.offer(req);
        }
        else{
            upPq.offer(req);
        }
        if(status!= Status.Moving){
            new Thread(this::move).start();
        }
    }
    public int getFloor(){
        return floor;
    }
    public Status getStatus(){
        return status;
    }
    public Direction getDirection(){
        return dir;
    }
    void move(){
        while(status==Status.Moving){
            updateDirection(Direction.UP);
            while(!upPq.isEmpty()){
                updateFloor(upPq.poll().floor);
            }
            updateDirection(Direction.DOWN);
            while(!downPq.isEmpty()){
                updateFloor(downPq.poll().floor);
            }
            if(upPq.isEmpty() && downPq.isEmpty()){
                status = Status.Idle;
                theElevator.status = Status.Idle;
                dir = null;
                break;
            }
        }
    }
}

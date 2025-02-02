package Observer;

public class Observer {
    String name;
    public Observer(String name){
        this.name = name;
    }
    public String update(){
        return "updating user "+name;
    }
}

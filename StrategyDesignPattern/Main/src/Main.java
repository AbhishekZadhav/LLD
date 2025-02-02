import Base.Cruiser;
import Base.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle cruiser = new Cruiser();
        System.out.println(cruiser.driveType());
        System.out.println("done");
    }
}
import BasePizzas.BasePizza;
import BasePizzas.Margarita;
import Toppings.Cheese;
import Toppings.Jalepeno;

public class Main {
    public static void main(String[] args) {
        BasePizza thePizza = new Jalepeno(new Cheese( new Margarita()));
        System.out.println(thePizza.cost());

    }
}
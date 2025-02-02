package Toppings;

import BasePizzas.BasePizza;

public class Cheese extends BaseTopping{
    BasePizza theBase;
    public Cheese(BasePizza theBase){
        this.theBase = theBase;
    }
    @Override
    public int cost() {
        return theBase.cost()+10;
    }
}

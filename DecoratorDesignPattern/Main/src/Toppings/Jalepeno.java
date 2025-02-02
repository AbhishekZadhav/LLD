package Toppings;

import BasePizzas.BasePizza;

public class Jalepeno extends BaseTopping{
    BasePizza theBase;
    public Jalepeno(BasePizza theBase){
        this.theBase = theBase;
    }
    @Override
    public int cost(){
        return theBase.cost()+10;
    }
}

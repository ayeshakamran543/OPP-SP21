
package pizza;

public class PizzaOrder {
    private  Pizza[] pizzas=new Pizza[3];
    
   
    public PizzaOrder(Pizza [] pizzas){
        for(int i=0;i<pizzas.length;i++)
            this.pizzas[i]=pizzas[i];
        
        
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }
    
    public double calcTotal(){
        double total = 0;
        if(pizzas[0]!=null)
            total+=pizzas[0].calcCost();
        if(pizzas[1]!=null)
            total+=pizzas[1].calcCost();
        if(pizzas[2]!=null)
            total+=pizzas[2].calcCost();
        System.out.println("The total cost of order is: ");
        return total;
    }
    
}

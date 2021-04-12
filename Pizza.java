package pizza;

public class Pizza {

    private String pizzaSize;
    private int noOfPepproniTop;
    private int noOfCheeseTop;
    private int noOfHamTop;

    public Pizza() {
        pizzaSize = " ";
        noOfPepproniTop = 0;
        noOfCheeseTop = 0;
        noOfHamTop = 0;
    }

    public Pizza(String pizzaSize, int noOfPepproniTop, int noOfCheeseTop, int noOfHamTop) {
        this.pizzaSize = pizzaSize;
        this.noOfCheeseTop = noOfCheeseTop;
        this.noOfPepproniTop = noOfPepproniTop;
        this.noOfHamTop = noOfHamTop;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setNoOfCheeseTop(int noOfCheeseTop) {
        this.noOfCheeseTop = noOfCheeseTop;
    }

    public void setNoOfPepproniTop(int noOfPepproniTop) {
        this.noOfPepproniTop = noOfPepproniTop;
    }

    public void setNoOfHamTop(int noOfHamTop) {
        this.noOfHamTop = noOfHamTop;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public int getNoOfCheeseTop() {
        return noOfCheeseTop;
    }

    public int getNoOfPepproniTop() {
        return noOfPepproniTop;
    }

    public int getNoOfHamTop() {
        return noOfHamTop;
    }

    public double calcCost() {
        if (pizzaSize==("Small")) {
            return 10 + 2 * (noOfCheeseTop + noOfPepproniTop + noOfHamTop);
        }
        else if (pizzaSize==("Medium")) {
            
            return 12 + 2 * (noOfCheeseTop + noOfPepproniTop + noOfHamTop);
        } 
        else if (pizzaSize==("Large")) {
            
            return  14 + 2 * (noOfCheeseTop + noOfPepproniTop + noOfHamTop);
        }
        else {
            return 0.0;
        }

    }

    public String getDiscription() {
        return "\nPizza size: " + pizzaSize
                + " \nNo. of Cheese topping: " + noOfCheeseTop
                + " \nNo. of pepproni toppings:  " + noOfPepproniTop
                + "\nNo. of ham toppings:  " + noOfHamTop
                + "\n Cost of Pizza: " + calcCost();
        
    }

}

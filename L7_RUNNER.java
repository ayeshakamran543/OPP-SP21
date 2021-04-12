
package pizza;
public class L7_RUNNER {
    public static void main(String[] args) {
        Pizza p1=new Pizza("Medium",1,2,3);
        Pizza p2=new Pizza("Small",4,3,2);
        
        PizzaOrder o1=new PizzaOrder(new Pizza[]{p1,p2}); 
        
        System.out.println(o1.calcTotal());
        
    }
    
}

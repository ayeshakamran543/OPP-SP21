
package shape;
public class Circle  implements Shape{
    private double rad;

    public Circle(int rad) {
        this.rad = rad;
    }
    

    @Override
    public double area() {
       return 2*3.1416*rad;
    }

  
    
    
}


package l4_a1;

public class L4_A1 {
    private int radius;
    public L4_A1(){
        radius=7;
    }
    public L4_A1(int r){
        radius=r;
    }
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return (radius);
    }
    public void display(){
        System.out.println("radius="+radius);
    }
    public void CalculateCircumference(){
        double a=3.14*radius*radius;
        System.out.println("Circumference="+a);
    }

   
    
}

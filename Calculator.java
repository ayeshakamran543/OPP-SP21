
package calculator;


public class Calculator {
    private static double x;
    private static double y;
    public Calculator(double a,double b){
        x=a;
        y=b;
    }
    public void setX(int a){
        x=a;
    }
    public void setY(int b){
        y=b;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public static void sum(){
        double s=x+y;
        System.out.println(x+"+"+y+" = "+s); 
    }
    public static void multiply(){
        double mul=x*y;
        System.out.println(x+"*"+y+" = "+mul);
        
    }
    public static void divide(){
        double div=x/y;
        System.out.println(x+"/"+y+" = "+div);
        
    }
    public static void modulus(){
        double mod=x%y;
        System.out.println(x+"%"+y+" = "+mod);
        
    }
    public static void sine(){
        double radian=Math.toRadians(x);
        double sin=Math.sin(radian);
        System.out.println("sine of "+x+" is "+sin);
    }
    public static void cosine(){
        double radian=Math.toRadians(y);
        double cos=Math.sin(radian);
        System.out.println("cosine of "+y+" is "+cos);
    }
     public static void tangent(){
        double radian=Math.toRadians(y);
        double tan=Math.sin(radian);
        System.out.println("tangent of "+y+" is "+tan);
    }
        
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

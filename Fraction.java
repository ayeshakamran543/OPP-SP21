
package fraction;

public class Fraction {
    private int num1;
    private int num2;
    public Fraction(){
        num1=0;
        num2=1;
    }
    public Fraction(int n1,int n2){
        num1=n1;
        num2=n2;   
    }
    public void setNum1(int n1){
        num1=n1;
    }
    public void setNum2(int n2){
        num2=n2;
    }
    public int getNum1(){
        return(num1);
    }
    public int getNum2(){
        return(num2);
    }
    public void Display(){
        System.out.println(num1+"/"+num2);
    }
    public boolean Equals(Fraction f1,Fraction f2){
        if(((double) f1.num1/(double) f1.num2)==((double) f2.num1/(double) f2.num2)){
            System.out.println("Two fractions are equal");
            return true;
        }
        else{
            System.out.println("Two fractions are not equal");
            return false;}
    }
    
    

    
   
    
}

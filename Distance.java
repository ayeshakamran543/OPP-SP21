
package distance;

public class Distance {
    private int feet;
    private int inches;
    public Distance(){
        feet=0;
        inches=0;
    }
    public Distance(int feet,int inches){
        this.feet=feet;
        this.inches=inches;    
    }
    public void setFeet(int feet){
        this.feet=feet;   
    }
    public void setInches(int inches){
        this.inches=inches;
    }
    public int getFeet(){
        return(feet);
    }
    public int getInches(){
        return(inches);
    }
    public void display(){
        System.out.println("The distance sum in feet is "+feet+" and in inches is "+inches);
    }
    public Distance Add(Distance o1,Distance o2){
        feet=o1.feet+o2.feet;
        inches=o1.inches+o2.inches;
       
        feet=feet+(inches/12);
        inches=inches%12;
        Distance sum=new Distance(feet,inches);
        return(sum);
    }
    

    
    
}

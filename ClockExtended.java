
package clock;
public class Child_class extends Clock{

    public Child_class(int hr, int min, int sec) {
        super(hr, min, sec);
    }

    @Override
    public void display() {
         if(hr >= 0 && hr <= 23 && min >= 0 && min <= 59 && sec >= 0 && sec<= 59){
            if(hr<=12  ){
              System.out.println( "24 hr Format= "+hr+":"+min+":"+sec+" AM ");
            }
            else{
                System.out.println( "24 hr Format= "+hr+":"+min+":"+sec+" PM ");
            }
            }
        
          else
             System.out.println( "invalid format") ;
             
        
    }
    
    
}

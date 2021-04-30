
package clock;
public class ClockExtended extends Clock{

    public ClockExtended(int hr, int min, int sec) {
        super(hr, min, sec);
    }

    @Override
    public void display() {
         if(hr >= 0 && hr <= 23 && min >= 0 && min <= 59 && sec >= 0 && sec<= 59){
            if(hr<=12 || hr==24 ){
              System.out.println( "24 hr Format= "+hr+":"+min+":"+sec+" AM ");
            }
            else if(hr>=12 || hr<24){
                System.out.println( "24 hr Format= "+hr+":"+min+":"+sec+" PM ");
            }
            }
        
          else
             System.out.println( "invalid format") ;
             
        
    }
    
    
}

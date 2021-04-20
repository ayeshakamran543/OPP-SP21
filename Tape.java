
package publication;

public class Tape extends Publication{
    private int timePlay;
    
    public Tape(String title, int price,int timePlay) {
        super(title, price);
        this.timePlay=timePlay;
    }

    public int getTimePlay() {
        return timePlay;
    }

    public void setTimePlay(int timePlay) {
        this.timePlay = timePlay;
    }
   
    @Override
    public void Display() {
        System.out.println("\n Tape title is "+title+
                "\n Tape price is "+price+
                "\n Time play in minutes is  "+timePlay);
    }
    
    
    
}

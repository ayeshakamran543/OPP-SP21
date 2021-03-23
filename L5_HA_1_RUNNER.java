
package distance;

public class L5_HA_1_RUNNER {
    public static void main(String[] args) {
        Distance d1=new Distance(5,6);
        Distance d2=new Distance(3,4);
        Distance d3=new Distance();
        Distance d4=d3.Add(d1, d2);
        
        d4.display();
        
        
        
    }
    
}

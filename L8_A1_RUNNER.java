
package publication;
import java.util.Scanner;
public class L8_A1_RUNNER {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the title");
        String title=input.next();
        System.out.println("Enter the Price");
        int price=input.nextInt();
        System.out.println("Enter the page count");
        int pagecount=input.nextInt();
        System.out.println("Enter the time play");
        int timeplay=input.nextInt();
        Book b1=new Book(title,price,pagecount);
        Tape t1=new Tape(title,price,timeplay);
        b1.Display();
        t1.Display();
    }
    
}

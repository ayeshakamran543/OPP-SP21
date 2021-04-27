
package task2;
import java.util.StringTokenizer;
public class L9_T2_RUNNER {
     public static void main(String[] args) {
        StringTokenizer s1=new StringTokenizer("MY NAME IS AYESHA KAMRAN 9");
        Task2 c1=null;
        while(s1.hasMoreTokens()){
            c1=new Task2(s1.nextToken());
        }
        int token_count=c1.countToken();
        System.out.println(token_count);
    }
}

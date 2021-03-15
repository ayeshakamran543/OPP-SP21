
package students;

public class L4_H3_RUN {
    public static void main(String[] args) {
        STUDENTS s1=new STUDENTS("AYESHA",new int[]{30,40,50,70,80});
        STUDENTS s2=new STUDENTS("ALI",new int[]{50,70,30,60,40});
        STUDENTS s3=new STUDENTS(s1.GetName(),s2.GetResult_Array());
        s1.Average();
        s2.Average();
        System.out.println("The average of 3 students is"+s3.Average());
        if(s1.Average()>s2.Average()){
            System.out.println("s1 has greater average");
        }
        else if(s2.Average()>s1.Average()){
            System.out.println("s2 has greater average");
        }
        
    }
    
}

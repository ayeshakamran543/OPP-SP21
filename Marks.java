
package marks;

public class Marks {
    private int subj1;
    private int subj2;
    private int subj3;
    public Marks(){
        subj1=0;
        subj2=0;
        subj3=0;
    }
    public Marks(int s1,int s2,int s3){
        subj1=s1;
        subj2=s2;
        subj3=s3;
        
    }
    public void setSubj1(int s1){
        subj1=s1;
    }
    public void setSubj2(int s2){
        subj2=s2;
    }
    public void setSubj3(int s3){
        subj3=s3;
    }
    public int getSubj1(){
        return(subj1);
    }
    public int getSubj2(){
        return(subj2);
    }
    public int getSubj3(){
        return(subj3);
    }
    public int Sum(){
        int sum1=subj1+subj2+subj3;
        System.out.println("The sum of marks of three subjects is: ");
        return(sum1);
    }

   
    
}


package students;
public class STUDENTS {
    private String Name;
    private int[] Result_Array=new int[5];
    public STUDENTS(String n,int[] r){
        Name=n;
        for(int i=0;i<5;i++){
            Result_Array[i]=r[i];
        }
        
    }
    public void SetName(String n){
        Name=n;
    }
    public void SetResult_Array(int[] r){
        Result_Array=r;
    }
    public String GetName(){
        return(Name);
    }
    public int[] GetResult_Array(){
        int[] Result_ArrayCopy=new int[5];
        for(int i=0;i<5;i++){
            Result_ArrayCopy[i]=Result_Array[i];    
        }
        return (Result_ArrayCopy);
    }
    public float Average(){
        float Avg;
        float sum=0;
        for(int i=0;i<5;i++){
            sum=sum+Result_Array[i];
        }
        Avg=sum/5;
        return Avg;
    }
    
    
}

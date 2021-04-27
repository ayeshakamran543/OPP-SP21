
package task2;

public class Task2 {
    static int token_count=0;
    
    Task2(String token){
         boolean isNum=false;
        if(token.charAt(0)>='0' && token.charAt(0)<='9'){
            isNum=true;
        }
        if(!isNum){
            token_count++;
        }
    }
   
    public int countToken(){
        return token_count;
    }
   
    

    

   
    
}

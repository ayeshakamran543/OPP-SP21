
package hotdogstand;

public class HotDogStand {
    private int ID_number;
    private int sold_hotdogs;
    public  HotDogStand(){
        ID_number=7651;
        sold_hotdogs=5;    
    }
    public  HotDogStand(int id,int sold){
        ID_number=id;
        sold_hotdogs=sold;    
    }
    public void SetID_number(int id){
        ID_number=id;
    }
    public void SetSoldHotDogs(int sold){
        sold_hotdogs=sold;
    }
    public int GetID_number(){
        return(ID_number);
    }
    public int GetSoldHotDogs(){
        JustSold();
        return(sold_hotdogs);
    }
    public int JustSold(){
        return(sold_hotdogs+=1);
    }
   
    
}


package hotdogstand;

public class L4_ASSIGNMENT1_RUN {
    public static void main(String[] args) {
        HotDogStand s1=new HotDogStand();
        s1.SetID_number(3453);
        s1.SetSoldHotDogs(5);
        System.out.println("The ID of the stand is "+s1.GetID_number()+" the number of hotdogs just sold is "+s1.GetSoldHotDogs());
        HotDogStand s2=new HotDogStand();
        s2.SetID_number(5477);
        s2.SetSoldHotDogs(10);
        System.out.println("The ID of the stand is "+s2.GetID_number()+" the number of hotdogs just sold is "+s2.GetSoldHotDogs());
        HotDogStand s3=new HotDogStand();
        s3.SetID_number(4458);
        s3.SetSoldHotDogs(8);
        System.out.println("The ID of the stand is "+s3.GetID_number()+" the number of hotdogs just sold is "+s3.GetSoldHotDogs());
        HotDogStand s4=new HotDogStand();
        s4.SetID_number(2452);
        s4.SetSoldHotDogs(20);
        System.out.println("The ID of the stand is "+s4.GetID_number()+" the number of hotdogs just sold is "+s4.GetSoldHotDogs());
    }
    
}

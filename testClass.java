
package pizza;

public class testClass {
        public static void main(String[] args) {
        Pizza p1=new Pizza("Small",1,2,3);
        Pizza p2=new Pizza("Medium",0,3,2);
        Pizza p3=new Pizza("Small",4,1,3);
        System.out.println(p1.getDiscription());
        System.out.println(p2.getDiscription());
        System.out.println(p3.getDiscription());
    }
    
}


package shape;
public class CalculateAreas  {
    Shape[] shap=new Shape[5];
      
      public double[] doubleSize(Shape[] s){
          double[] arr=new double[s.length];
          for(int i=0;i<s.length;i++){
              arr[i]=s[i].area();
              
          }
          return arr;
      }
      
    
}

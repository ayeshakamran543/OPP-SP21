
package rectangle;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle(){
        length=3;
        width=4;
    }
    public Rectangle(int l,int w){
        length=l;
        width=w;
    }
    public void setLength(int l){
        length=l;
    }
    public void setWidth(int w){
        width=w;
    }
    public int getLength(){
        return(length);
    }
    public int getWidth(){
        return(width);
    }
    public int Area(){
        return(length*width);
    }
    
    
}

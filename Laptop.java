
package computer;
public class Laptop extends Computer{
    private int length;
    private int width;
    private int height;
    private int weight;
    public Laptop(){
        length=0;
        width=0;
        height=0;
        weight=0; 
    }
    public Laptop(int wordSize,int memorySize,int storageSize,int speed,int length,int width,int height,int weight ){
        super(wordSize,memorySize,storageSize,speed);
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public void Display(){
        System.out.println("\n The word size in bits is "+wordSize+
                "\n The memory size in megabytes is "+memorySize+
                "\n The storage size in megabytes is "+storageSize+
                "\n The speed in mega hertz is "+speed+
                "\n The length of laptop is "+length+
                "\n The width of laptop is "+width+
                "\n The heigth of laptop is "+height+
                "\n The weight of laptop is "+weight);
    }

  
    
    
}


package computer;

public class Computer {
    protected int wordSize;//in bits
    protected int memorySize;//in megabytes
    protected int storageSize;//in megabytes
    protected int speed;//in megaHertz
    public Computer(){
        wordSize=0;
        memorySize=0;
        storageSize=0;
        speed=0;
    }
    public Computer(int wordSize,int memorySize,int storageSize,int speed){
        this.wordSize=wordSize;
        this.memorySize=memorySize;
        this.storageSize=storageSize;
        this.speed=speed;
    }

    public int getWordSize() {
        return wordSize;
    }

    public void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
  
    public void Display(){
        System.out.println("\n The word size in bits is "+wordSize+
                "\n The memory size in megabytes is "+memorySize+
                "\n The storage size in megabytes is "+storageSize+
                "\n The speed in mega hertz is "+speed);
    }

    
    
}

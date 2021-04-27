
package clock;

public class Clock {
    protected int hr;
    protected int min;
    protected int sec;
    public Clock(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
    public void display() {
        System.out.println( "hr:" + hr + " min:" + min + "sec:" + sec) ;
    }
    
    
}

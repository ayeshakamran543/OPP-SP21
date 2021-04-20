
package publication;

public class Publication {
    protected String title;
    protected int price;
    public Publication(String title,int price){
        this.title=title;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void Display(){
        System.out.println("\nThe title is "+title+
                "\nThe price is  "+price);
    } 

    
    
}

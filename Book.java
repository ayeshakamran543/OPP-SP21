
package publication;

public class Book extends Publication{
    private int pageCount;
    public Book(String title, int price,int pageCount) {
        super(title, price);
        this.pageCount=pageCount;
        
    }
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    @Override
    public void Display() {
        
        System.out.println("\n Book title is "+title+
                "\n Book price is "+price+
                "\n Page count is "+pageCount);
    }
    
}

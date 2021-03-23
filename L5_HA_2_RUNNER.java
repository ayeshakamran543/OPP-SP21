
package book;

public class L5_HA_2_RUNNER {
     public static void main(String[] args) {
         Book book1=new Book();
         book1.setChapterNames(new String []{"chap1","chap2","chap3"});
         book1.setAuthors("Leo Tolstoy");
         Book book2=new Book("William Shakespeare",new String[]{"chap1","chp2","chap3","chp4"});
         Book book3=new Book();
         boolean book4=book3.compareBooks(book1, book2);
         Book book5=book3.commpareChapterNames(book1, book2);
         
         
         
         
        
    }
    
}

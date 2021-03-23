package book;

public class Book {

    private String author;
    private String[] chapterNames = new String[100];

    public Book() {
        author = null;
        chapterNames = null;
    }

    public Book(String author, String[] ChapNames) {
        this.author = author;
        for (int i = 0; i < chapterNames.length; i++) {
            chapterNames[i] = ChapNames[i];
        }

    }

    public void setChapterNames(String[] chapNames) {
        String[] new_chapNames = new String[100];
        System.arraycopy(chapNames, 0, chapterNames, 0, chapterNames.length);

    }

    public void setAuthors(String author) {
        this.author = author;

    }

    public boolean compareBooks(Book b1, Book b2) {
        if (b1.author == b2.author) {
            return (true);
        } else {
            return false;
        }
    }

    public Book commpareChapterNames(Book b1, Book b2) {
        int count1 = chapterNames.length;
        int count2 = chapterNames.length;
        if (count1 > count2) {
            System.out.println("Book1 has larger number of chapters");
            return b1;

        } else {
            System.out.println("Book2 has larger number of chapters");
        }
        return b2;

    }
    public void display(Book b1,Book b2){
        int c1=chapterNames.length;
        int c2=chapterNames.length;
        if(c1>c2){
            System.out.println(b1.author);
        }
        else{
            System.out.println(b2.author);
        }
    }

}

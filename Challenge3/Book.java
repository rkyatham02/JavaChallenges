import java.util.ArrayList;

public class Book{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getISBN(){
        return this.ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public static void addBook(Book book){
        bookCollection.add(book);
    }

    public static void removeBook(Book book){
        bookCollection.remove(book);
    }
    
    public static ArrayList<Book> getBookCollection(){
        return bookCollection;
    }

}
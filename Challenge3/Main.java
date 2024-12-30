import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        
        Book.addBook(book1);
        Book.addBook(book2);

        ArrayList<Book> bookCollection = Book.getBookCollection();

        for (int i=0; i < bookCollection.size(); i++){
            Book currentBook = bookCollection.get(i);
            System.out.println("This book is by " + currentBook.getAuthor());
        }
    }
}
package Lesson3Task5;
import java.util.List;
import java.util.ArrayList;
public class Library {
    private List<Book> books;
    public Library()
    {
        books = new ArrayList<>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void removeBook(Book book)
    {
        books.remove(book);
    }
    public List<Book> findBooksByAuthor(Author author)
    {
        List<Book> res = new ArrayList<>();
        for(Book i:books){
            if(i.getAuthor().equals(author)){
                res.add(i);
            }
        }
        return res;
    }
    public void displayLibrary()
    {
        for (Book i:books){
            System.out.println(i);
        }
    }
}

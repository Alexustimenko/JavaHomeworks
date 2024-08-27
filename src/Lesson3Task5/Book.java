package Lesson3Task5;

public class Book {
    private String title;
    private  Author author;
    private int publicate;
    public Book(String title, Author author, int publicate)
    {
        this.title=title;
        this.author=author;
        this.publicate=publicate;
    }
    public String getTitle()
    {
        return title;
    }
    public Author getAuthor()
    {
        return author;
    }
    public int getPublicate()
    {
        return publicate;
    }
    @Override
    public String toString()
    {
        return "Title " + title + " author " + author + "("+publicate+")";
    }
}

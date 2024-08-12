package Lesson3Task5;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("AAA","Brookl");
        Author author2 = new Author("BBB","Toolk");
        Author author3 = new Author("CCC","Roo");
        Book book1 = new Book("My Favourite Book",author1,2001);
        Book book2 = new Book("Rainbow",author2,2015);
        Book book3 = new Book("Railroad",author3,2024);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("Все книги: ");
        library.displayLibrary();
        System.out.println("\nКниги автора AAA: ");
        for (Book i: library.findBooksByAuthor(author1)){
            System.out.println(i);
        }
        library.removeBook(book1);
        System.out.println("\nВсе книги после удаления книги My Favourite Book: ");
        library.displayLibrary();
    }
}

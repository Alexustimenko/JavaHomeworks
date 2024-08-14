package lesson2Task2; // Указывает, что класс находится в пакете lesson2Task2

// Определение класса Main, содержащего метод main
public class Main {
    public static void main(String[] args) {
        // Создание объектов Author
        Author auth1 = new Author("Tom", "Jerryfield"); // Автор с именем Tom и фамилией Jerryfield
        Author auth2 = new Author("Alex", "Aleksov"); // Автор с именем Alex и фамилией Aleksov

        // Создание объектов Book
        Book book1 = new Book("AAA", auth1, 54); // Книга с заголовком AAA, автором auth1 и 54 страницами
        Book book2 = new Book("BBB", auth2, 100); // Книга с заголовком BBB, автором auth2 и 100 страницами

        // Создание объектов Member
        Member member1 = new Member("Kim", 74); // Член библиотеки с именем Kim и идентификатором 74
        Member member2 = new Member("Donald", 777); // Член библиотеки с именем Donald и идентификатором 777

        // Создание объекта Library
        Library library = new Library(); // Создание новой библиотеки

        // Добавление книг в библиотеку
        library.addBook(book1); // Добавляет книгу book1 в библиотеку
        library.addBook(book2); // Добавляет книгу book2 в библиотеку

        // Регистрация членов в библиотеке
        library.registerRider(member1); // Регистрирует члена member1 в библиотеке
        library.registerRider(member2); // Регистрирует члена member2 в библиотеке

        // Вывод информации о библиотеке
        System.out.println(library); // Выводит информацию о библиотеке (количество книг и членов)

        // Попытка выдать книгу member1
        if (library.getBook(member1, book1)) {
            System.out.println(member1.getName() + " took " + book1.getTitle()); // Выводит сообщение, если книга успешно выдана
        } else {
            System.out.println(member1.getName() + " couldn't take " + book1.getTitle()); // Выводит сообщение, если книга не была выдана
        }

        // Попытка возврата книги member1
        if (library.returnBook(member1, book1)) {
            System.out.println(member1.getName() + " returned " + book1.getTitle()); // Выводит сообщение, если книга успешно возвращена
        } else {
            System.out.println(member1.getName() + " didn't return " + book1.getTitle()); // Выводит сообщение, если книга не была возвращена
        }

        // Вывод информации о библиотеке после возврата книги
        System.out.println(library); // Выводит информацию о библиотеке (количество книг и членов)
    }
}

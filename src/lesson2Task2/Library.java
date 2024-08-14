package lesson2Task2; // Указывает, что класс находится в пакете lesson2Task2

import java.util.List; // Импортирует интерфейс List из пакета java.util
import java.util.ArrayList; // Импортирует класс ArrayList из пакета java.util

// Определение класса Library
public class Library {
    private List<Book> books;       // Поле для хранения списка книг в библиотеке
    private List<Member> members;   // Поле для хранения списка членов библиотеки

    // Конструктор класса Library, инициализирующий пустые списки для книг и членов
    public Library() {
        this.books = new ArrayList<>(); // Создает новый ArrayList для хранения книг
        this.members = new ArrayList<>(); // Создает новый ArrayList для хранения членов
    }

    // Метод для добавления книги в библиотеку
    public void addBook(Book book) {
        books.add(book); // Добавляет книгу в список книг
    }

    // Метод для удаления книги из библиотеки
    public void removeBook(Book book) {
        books.remove(book); // Удаляет книгу из списка книг
    }

    // Метод для регистрации нового члена библиотеки
    public void registerRider(Member member) {
        members.add(member); // Добавляет члена в список членов
    }

    // Метод для исключения члена из библиотеки
    public void unregisterReader(Member member) {
        members.remove(member); // Удаляет члена из списка членов
    }

    // Метод для выдачи книги члену библиотеки
    public boolean getBook(Member member, Book book) {
        // Проверяет, доступна ли книга и зарегистрирован ли член в библиотеке
        if (book.isAvailable() && members.contains(member)) {
            book.setAvailable(false); // Устанавливает книгу как недоступную
            member.takeBook(book);    // Добавляет книгу в список взятых книг члена
            return true;             // Возвращает true, если книга успешно выдана
        }
        return false; // Возвращает false, если книга не доступна или член не зарегистрирован
    }

    // Метод для возврата книги членом библиотеки
    public boolean returnBook(Member member, Book book) {
        // Проверяет, взята ли книга членом
        if (member.getBooks().contains(book)) {
            book.setAvailable(true); // Устанавливает книгу как доступную
            member.returnBook(book); // Удаляет книгу из списка взятых книг члена
            return true;             // Возвращает true, если книга успешно возвращена
        }
        return false; // Возвращает false, если книга не была взята членом
    }

    // Переопределенный метод toString() для представления информации о библиотеке
    @Override
    public String toString() {
        // Форматирует строку с количеством книг и членов библиотеки
        return "Library with " + books.size() + " books and " + members.size() + " members.";
    }
}

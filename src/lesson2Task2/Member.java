package lesson2Task2; // Указывает, что класс находится в пакете lesson2Task2

import java.util.List; // Импортирует интерфейс List из пакета java.util
import java.util.ArrayList; // Импортирует класс ArrayList из пакета java.util

// Определение класса Member
public class Member {
    private String name;            // Поле для хранения имени члена библиотеки
    private List<Book> books;       // Поле для хранения списка книг, взятых членом

    // Конструктор класса Member, инициализирующий имя члена и создающий пустой список книг
    public Member(String name, int id) {
        this.name = name;           // Инициализация поля name
        this.books = new ArrayList<>(); // Инициализация списка books как пустого ArrayList
    }

    // Метод для получения имени члена
    public String getName() {
        return name; // Возвращает значение поля name
    }

    // Метод для установки имени члена
    public void setName(String name) {
        this.name = name; // Устанавливает новое значение для поля name
    }

    // Метод для получения списка книг, взятых членом
    public List<Book> getBooks() {
        return books; // Возвращает список книг
    }

    // Метод для добавления книги в список взятых книг
    public void takeBook(Book book) {
        books.add(book); // Добавляет книгу в список взятых книг
    }

    // Метод для удаления книги из списка взятых книг
    public void returnBook(Book book) {
        books.remove(book); // Удаляет книгу из списка взятых книг
    }

    // Переопределенный метод toString() для представления информации о члене и его взятых книгах
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Создает объект StringBuilder для построения строки
        sb.append(name).append(" has taken:\n"); // Добавляет имя члена и заголовок

        if (books.isEmpty()) { // Проверяет, есть ли взятые книги
            sb.append("No books taken"); // Добавляет сообщение, если книг нет
        } else {
            for (Book book : books) { // Перебирает все взятые книги
                sb.append("- ").append(book).append("\n"); // Добавляет информацию о книге в строку
            }
        }

        return sb.toString(); // Возвращает сформированную строку
    }
}

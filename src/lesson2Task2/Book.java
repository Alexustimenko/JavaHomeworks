package lesson2Task2; // Указывает, что класс находится в пакете lesson2Task2

// Определение класса Book
public class Book {
    private String title;        // Поле для хранения заголовка книги
    private Author author;       // Поле для хранения автора книги
    private boolean available;   // Поле для хранения статуса доступности книги
    private int numberOfPages;   // Поле для хранения количества страниц книги

    // Конструктор класса Book, инициализирующий заголовок, автора, количество страниц и статус доступности книги
    public Book(String title, Author author, int numberOfPages) {
        this.title = title;            // Инициализация поля title
        this.author = author;          // Инициализация поля author
        this.numberOfPages = numberOfPages; // Инициализация поля numberOfPages
        this.available = true;         // Инициализация поля available по умолчанию как true
    }

    // Метод для получения заголовка книги
    public String getTitle() {
        return title; // Возвращает значение поля title
    }

    // Метод для установки заголовка книги
    public void setTitle(String title) {
        this.title = title; // Устанавливает новое значение для поля title
    }

    // Метод для получения автора книги
    public Author getAuthor() {
        return author; // Возвращает значение поля author
    }

    // Метод для установки автора книги
    public void setAuthor(Author author) {
        this.author = author; // Устанавливает новое значение для поля author
    }

    // Метод для получения статуса доступности книги
    public boolean isAvailable() {
        return available; // Возвращает значение поля available
    }

    // Метод для установки статуса доступности книги
    public void setAvailable(boolean available) {
        this.available = available; // Устанавливает новое значение для поля available
    }

    // Метод для получения количества страниц книги
    public int getNumberOfPages() {
        return numberOfPages; // Возвращает значение поля numberOfPages
    }

    // Метод для установки количества страниц книги
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages; // Устанавливает новое значение для поля numberOfPages
    }

    // Переопределенный метод toString() для представления объекта Book в виде строки
    @Override
    public String toString() {
        // Форматирует строку, включающую заголовок книги, автора, количество страниц и статус доступности
        return String.format("%s by %s, %d pages, Available: %b",
                title, author, numberOfPages, available);
    }
}

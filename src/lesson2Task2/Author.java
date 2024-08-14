package lesson2Task2; // Указывает, что класс находится в пакете lesson2Task2

// Определение класса Author
public class Author {
    private String name;   // Поле для хранения имени автора
    private String surname; // Поле для хранения фамилии автора

    // Конструктор класса Author, инициализирующий имя и фамилию автора
    public Author(String name, String surname) {
        this.name = name;         // Инициализация поля name
        this.surname = surname;   // Инициализация поля surname
    }

    // Метод для получения имени автора
    public String getName() {
        return name; // Возвращает значение поля name
    }

    // Метод для установки имени автора
    public void setName(String name) {
        this.name = name; // Устанавливает новое значение для поля name
    }

    // Метод для получения фамилии автора
    public String getSurname() {
        return surname; // Возвращает значение поля surname
    }

    // Метод для установки фамилии автора
    public void setSurname(String surname) {
        this.surname = surname; // Устанавливает новое значение для поля surname
    }

    // Переопределенный метод toString() для представления объекта Author в виде строки
    @Override
    public String toString() {
        return name + " " + surname; // Возвращает имя и фамилию автора, разделенные пробелом
    }
}

package Lesson2task11;
import java.util.Scanner;
public class DlinaPoslednegoSlovaVStroke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку, содержащую слова, разделенные пробелами:");
        String stroka = input.nextLine();
        stroka=stroka.trim();
        if(stroka.isEmpty())
        {
            System.out.println("Строка пуста.");
            input.close();
            return;
        }
        String[] slova = stroka.split("\\s+");
        System.out.println("Длина последнего слова = "+slova[slova.length-1].length());
        input.close();
    }
}

package lesson2Task12;

import java.util.Scanner;
import java.util.InputMismatchException;
public class SobratStrokuIzMassiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=-1;
        while (size <= 0) {
            System.out.println("Введите размер массива (положительное число):");
            try {
                size = input.nextInt();
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным числом.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Введите целое положительное число.");
                input.next(); // Очистка неверного ввода
            }
        }
        String[] myArray = new String[size];
        input.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите строку "+(i+1)+" : ");
            myArray[i]=input.nextLine();
        }
        StringBuilder bulld = new StringBuilder();
        for (String i:myArray)
        {
            bulld.append(i).append(" ");
        }
        String result = bulld.toString().trim();
        System.out.println("Результат объединения: "+result);
    }
}

package Lesson2Task7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FindIndexOfExactElementInAray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = -1;

        // Запрашиваем размер массива у пользователя
        while (size <= 0) {
            System.out.println("Введите размер массива только положительное число");
            try {
                size = input.nextInt();
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным");
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Введите целое положительное число.");
                input.next(); // Очистка некорректного ввода
            }
        }

        // Создаем массив и заполняем его числами от пользователя
        int[] myArray = new int[size];
        System.out.println("Введите " + size + " чисел для массива:");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    myArray[i] = input.nextInt();
                    break; // Прерывание цикла при корректном вводе
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод. Введите целое число.");
                    input.next(); // Очистка некорректного ввода
                }
            }
        }

        // Печатаем массив
        System.out.println("Массив:");
        System.out.println(Arrays.toString(myArray));

        // Запрашиваем элемент для поиска
        System.out.println("Введите элемент для поиска:");
        int search = -1;
        while (true) {
            try {
                search = input.nextInt();
                break; // Прерывание цикла при корректном вводе
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Введите целое число.");
                input.next(); // Очистка некорректного ввода
            }
        }

        // Поиск элемента и вывод результата
        int index = findIndex(myArray, search);
        if (index != -1) {
            System.out.println("Элемент найден. Его индекс = " + index);
        } else {
            System.out.println("Элемент не найден.");
        }

        input.close();
    }

    // Метод для поиска индекса элемента в массиве
    private static int findIndex(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return i; // Возвращаем индекс найденного элемента
            }
        }
        return -1; // Элемент не найден
    }
}

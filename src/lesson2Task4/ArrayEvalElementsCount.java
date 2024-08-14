package lesson2Task4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayEvalElementsCount {
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

        // Создаем массив и заполняем его случайными числами
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100); // Случайное число от 0 до 99
        }

        // Печатаем содержимое массива
        System.out.println("Массив:");
        System.out.println(Arrays.toString(myArray));

        // Определяем количество четных элементов
        int evenNumbersCount = countEven(myArray);
        System.out.println("Количество четных элементов = " + evenNumbersCount);

        input.close();
    }

    // Метод для подсчета четных элементов
    public static int countEven(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

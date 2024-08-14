package lesson2Task9;

import java.util.Arrays;
import java.util.InputMismatchException;

import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=-1;
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
        int[] MyArray= new int[size];

        for (int i = 0; i < size; i++) {
            MyArray[i]=(int) (Math.random()*100);
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(MyArray));
        shuffle(MyArray);
        System.out.println("Новый массив:");
        System.out.println(Arrays.toString(MyArray));
        input.close();
    }
    private static void shuffle(int[] arr)
    {
        for (int i = arr.length-1; i >0 ; i--) {
            int index = (int) (Math.random()*(i+1));
            int t =arr[i];
            arr[i]=arr[index];
            arr[index]=t;
        }
    }
}

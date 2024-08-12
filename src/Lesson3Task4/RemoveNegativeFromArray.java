package Lesson3Task4;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveNegativeFromArray {
    public static int[] removerNegative(int[] numbers){
        int counter =0;
        for(int i: numbers)
        {
            if(i>=0){
                counter++;
            }
        }
        int[] positive = new int[counter];
        int index =0;
        for (int i :numbers){
            if (i>=0){
                positive[index++]=i;
            }
        }
        return positive;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size =-1;
        while (size<=0){
            System.out.print("Введите размер массива (положительное число): ");
            if (input.hasNextInt()){
                size=input.nextInt();
                if (size<=0){
                    System.out.println("Размер массива должен быть положительным числом.");
                }
            } else {
                System.out.println("Пожалуйста, введите корректное целое число.");
                input.next();
            }
        }
        input.close();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = (int) (Math.random()*21)-10;
        }
        System.out.println("Массив перед удалением отрицательных чисел:");
        System.out.println(Arrays.toString(myArray));
        int[] positive = removerNegative(myArray);
        System.out.println("Массив после удаления отрицательных чисел:");
        System.out.println(Arrays.toString(positive));
    }
}

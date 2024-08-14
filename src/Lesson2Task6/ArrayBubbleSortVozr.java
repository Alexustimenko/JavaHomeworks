package Lesson2Task6;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayBubbleSortVozr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size =-1;
        while (size<=0)
        {
            System.out.println("Введите размер массива только положительное число");
            try
            {
                size=input.nextInt();
                if(size<=0)
                {
                    System.out.println("Размер массива должен быть положительным");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Некорректный ввод. Введите целое положительное число.");
                input.next();
            }
        }
        int[] myArray = new int[size];
        for(int i = 0;i<size;i++)
        {
            myArray[i] = (int) (Math.random()*100);
        }
        System.out.println("Массив");
        System.out.println(Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println("Отсортированный по возрастанию массив");
        System.out.println(Arrays.toString(myArray));
        input.close();
    }
    public static void bubbleSort(int[] arr)
    {
        int size = arr.length;
        boolean sw;
        for(int i=0;i<size-1;i++)
        {
            sw=false;
            for(int j=0;j<size-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    sw=true;
                }
            }
            if(!sw)
            {
                break;
            }
        }
    }
}

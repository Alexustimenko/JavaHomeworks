package lesson2Task5;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayMinMaxElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size =-1;
        while(size<=0)
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
        for(int i=0;i<size;i++)
        {
            myArray[i] = (int) (Math.random()*100);
        }
        System.out.println("Массив");
        System.out.println(Arrays.toString(myArray));
        int maximum = findMaximum(myArray);
        int minimum = findMinimum(myArray);
        System.out.println("Максимальный элемент = "+maximum);
        System.out.println("Минимальный элемент = "+minimum);
        input.close();
    }
    public static int findMaximum(int[] arr)
    {
        int maximum = arr[0];
        for(int i:arr)
        {
            if (i>maximum)
            {
                maximum=i;
            }
        }
        return maximum;
    }
    public static int findMinimum(int[] arr)
    {
        int minimum = arr[0];
        for(int i:arr)
        {
            if(i<minimum)
            {
                minimum=i;
            }
        }
        return minimum;
    }
}

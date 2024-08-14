package Lesson2Task8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SumOfEachRowAndColumn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows=-1;
        int cols=-1;
        while (rows<=0)
        {
            System.out.println("Введите количество строк только положительное число");
            try
            {
                rows=input.nextInt();
                if(rows<=0)
                {
                    System.out.println("Количество строк должно быть положительным");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Некорректный ввод.Введите только целое положительное число");
                input.next();
            }
        }
        while (cols<=0)
        {
            System.out.println("Введите количество столбцов только положительное число");
            try {
                cols=input.nextInt();
                if (cols<=0)
                {
                    System.out.println("Количество столбцов должно быть положительным");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Некорректный ввод.Введите только целое положительное число");
                input.next();
            }
        }
        int[][]myTwoDimentionArray=new int[rows][cols];
        System.out.println("Введите элементы массива:");
        for(int i =0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                while (true)
                {
                    try
                    {
                        System.out.printf("Элемент [%d][%d]: ", i, j);
                        myTwoDimentionArray[i][j] = input.nextInt();
                        break;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Некорректный ввод.Введите только целое положительное число");
                        input.next();
                    }
                }
            }
        }
        System.out.println("Массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myTwoDimentionArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов в каждой строке:");
        for (int i = 0; i < rows; i++) {
            int rSum=0;
            for (int j = 0; j < cols; j++) {
                rSum+=myTwoDimentionArray[i][j];
            }
            System.out.println("Строка " + (i + 1) + ": " + rSum);
        }
        System.out.println("Сумма элементов в каждом столбце:");
        for (int j = 0; j < cols; j++) {
            int cSum=0;
            for (int i = 0; i < rows; i++) {
                cSum+=myTwoDimentionArray[i][j];
            }
            System.out.println("Столбец " + (j + 1) + ": " + cSum);
        }
        input.close();
    }
}

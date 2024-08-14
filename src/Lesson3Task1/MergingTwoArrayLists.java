package Lesson3Task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MergingTwoArrayLists
{
    private static ArrayList<Integer> generateLst(int size)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int number = (int) (Math.random()*100);
            lst.add(number);
        }
        return lst;
    }
    private static ArrayList<Integer> merger(ArrayList<Integer> lst1,ArrayList<Integer> lst2)
    {
        ArrayList<Integer> mergedArrayList = new ArrayList<>(lst1);
        mergedArrayList.addAll(lst2);
        return mergedArrayList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1 =-1;
        int size2=-1;
        while (size1<=0){
            System.out.print("Введите размер первого списка (положительное целое число): ");
            if (input.hasNextInt()){
                size1=input.nextInt();
                if (size1<=0){
                    System.out.println("Размер должен быть положительным числом. Попробуйте снова.");
                }
            } else {
                System.out.println("Введите корректное целое число.");
                input.next();
            }
        }
        while (size2<=0){
            System.out.print("Введите размер второго списка (положительное целое число): ");
            if (input.hasNextInt()){
                size2=input.nextInt();
                if (size2<=0){
                    System.out.println("Размер должен быть положительным числом. Попробуйте снова.");
                }
            } else {
                System.out.println("Введите корректное целое число.");
                input.next();
            }
        }
        ArrayList<Integer> list1 = generateLst(size1);
        ArrayList<Integer> list2 = generateLst(size2);
        ArrayList<Integer> merged = merger(list1,list2);
        System.out.println("Первый список: " + list1);
        System.out.println("Второй список: " + list2);
        System.out.println("Объединенный список: " + merged);
        input.close();
    }

}

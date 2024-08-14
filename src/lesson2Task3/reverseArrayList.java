package lesson2Task3;
import java.util.ArrayList;
import java.util.Scanner;
public class reverseArrayList
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите числа разделенные пробелом");
        String numbers = input.nextLine();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        String[] numbersSplited = numbers.split(" ");
        for(String i : numbersSplited)
        {
            try
            {
                arrayList1.add(Integer.parseInt(i));
            }
            catch (NumberFormatException e)
            {

            }
        }
        System.out.println("До перестановки:");
        printArrayList(arrayList1);
        reverseList(arrayList1);
        System.out.println("После перестановки:");
        printArrayList(arrayList1);
        input.close();
    }
    private static void printArrayList(ArrayList<Integer> list)
    {
        for (int i: list)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void reverseList(ArrayList<Integer> lst)
    {
        int size = lst.size();
        for(int i=0;i<size/2;i++)
        {
            int t=lst.get(i);
            lst.set(i,lst.get(size-1-i));
            lst.set(size-1-i,t);
        }
    }

}

package Lesson3Task2;
import java.util.ArrayList;
import java.util.Scanner;
public class SortArrayListAlphabetOrder {
    private static void bubbleSort(ArrayList<String> lst){
        int size = lst.size();
        boolean sw;
        for (int i = 0; i < size-1; i++) {
            sw=false;
            for (int j = 0; j < size-1-i; j++) {
                if (lst.get(j).compareTo(lst.get(j+1)) > 0)
                {
                    String t = lst.get(j);
                    lst.set(j,lst.get(j+1));
                    lst.set(j+1,t);
                    sw=true;
                }
            }
            if (!sw)
            {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Введите строки (введите 'end' для завершения ввода):");
        while (true){
            String str = input.nextLine();
            if ("end".equalsIgnoreCase(str))
            {
                break;
            }
            strings.add(str);
        }
        bubbleSort(strings);
        System.out.println("Отсортированный список:");
        for (String i :strings)
        {
            System.out.println(i);
        }
        input.close();
    }
}

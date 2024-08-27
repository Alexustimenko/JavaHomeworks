package Lesson3Task3;
import java.util.ArrayList;
import java.util.Scanner;
public class ShuffleStringArrayList
{
    private static void ShuffleList(ArrayList<String> lst)
    {
        int size = lst.size();
        for (int i = size-1; i >0 ; i--) {
            int j = (int) (Math.random()*(i+1));
            String t = lst.get(i);
            lst.set(i,lst.get(j));
            lst.set(j,t);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Введите строки (введите 'end' для завершения ввода):");
        while (true){
            String str = input.nextLine();
            if("end".equalsIgnoreCase(str))
            {
                break;
            }
            strings.add(str);
        }
        ShuffleList(strings);
        System.out.println("Перемешанный список:");
        for (String i :strings) {
            System.out.println(i);
        }
        input.close();
    }
}

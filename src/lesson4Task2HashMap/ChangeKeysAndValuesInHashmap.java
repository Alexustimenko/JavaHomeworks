package lesson4Task2HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ChangeKeysAndValuesInHashmap {
    public static <K,V> Map<V,K> reverseHashMap(Map<K,V> m)
    {
        Map<V,K> reverse = new HashMap<>();
        for (Map.Entry<K,V> e:m.entrySet())
        {
            K k = e.getKey();
            V v = e.getValue();
            reverse.put(v,k);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,String> m1 = new HashMap<>();
        System.out.println("Количество записей для базы:");
        int size =-1;
        while (size<1)
        {
            try {
                size = Integer.parseInt(input.nextLine());
                if (size<1)
                {
                    System.out.println("Не положительное число");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Неправильный формат");
            }
        }
        for (int i=0;i<size;i++)
        {
            String k = null;
            String v = null;
            while (k==null || k.trim().isEmpty())
            {
                System.out.println("Ключ:");
                k=input.nextLine();
                if (k.trim().isEmpty())
                {
                    System.out.println("Неправильный ключ");
                }
            }
            while (v==null || v.trim().isEmpty())
            {
                System.out.println("Значение:");
                v=input.nextLine();
                if (v.trim().isEmpty())
                {
                    System.out.println("Неправильное значение");
                }
            }
            m1.put(k,v);
        }
        System.out.println("\nДо замены местами:");
        for (Map.Entry<String,String> e: m1.entrySet())
        {
            System.out.println(e.getKey()+": "+e.getValue());
        }
        Map<String,String> result = reverseHashMap(m1);
        System.out.println("\nПосле:");
        for (Map.Entry<String,String> e: result.entrySet())
        {
            System.out.println(e.getKey()+": "+e.getValue());
        }
        input.close();
    }
}

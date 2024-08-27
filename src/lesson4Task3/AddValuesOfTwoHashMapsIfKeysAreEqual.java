package lesson4Task3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddValuesOfTwoHashMapsIfKeysAreEqual {
    public static <K,V extends Number> Map<K,V> addValuesTwoHashMaps(Map<K,V> m1,Map<K,V> m2)
    {
        Map<K,V> combined = new HashMap<>(m1);
        for (Map.Entry<K,V> e:m2.entrySet()){
            K k = e.getKey();
            V v = e.getValue();;
            if (combined.containsKey(k))
            {
                V value = combined.get(k);
                combined.put(k,addition(value,v));
            }
            else {
                combined.put(k,v);
            }
        }
        return combined;
    }
    public static <V extends Number> V addition(V v1,V v2)
    {
        if (v1 instanceof Integer)
        {
            return (V) Integer.valueOf(v1.intValue()+v2.intValue());
        }
        else if (v1 instanceof Double)
        {
            return (V) Double.valueOf(v1.doubleValue()+v2.doubleValue());
        } else if (v1 instanceof Float)
        {
            return (V) Float.valueOf(v1.floatValue()+v2.floatValue());
        } else if (v1 instanceof Long)
        {
            return (V) Long.valueOf(v1.longValue()+v2.longValue());
        }
        else if (v1 instanceof Short)
        {
            return (V) Short.valueOf((short) (v1.shortValue()+v2.shortValue()));
        }
        throw new IllegalArgumentException("Неправильный тип");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,Integer> m1 = new HashMap<>();
        Map<String,Integer> m2 = new HashMap<>();
        System.out.println("Введите количество записей для первой базы:");
        int size1 =-1;
        while (size1<1)
        {
            System.out.println("Количество записей: ");
            try {
                size1=Integer.parseInt(input.nextLine());
                if (size1<1){
                    System.out.println("Не положительное число");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ошибка в формате");
            }
        }
        int counter1 =0;
        while (counter1<size1)
        {
            System.out.println("Ключ:");
            String k = input.nextLine();
            int v =-1;
            while (v<0)
            {
                System.out.println("Введите неотрицательное число: ");
                try {
                    v=Integer.parseInt(input.nextLine());
                    if (v <0)
                    {
                        System.out.println("Число должно быть неотрицательным");
                    }
                }
                catch (NumberFormatException e){
                    System.out.println("Ошибка формата");
                }
            }
            m1.put(k,v);
            counter1++;
        }
        System.out.println("Количество записей для второй базы:");
        int size2=-1;
        while (size2<1){
            System.out.println("Количество записей");
            try {
                size2=Integer.parseInt(input.nextLine());
                if (size2<1)
                {
                    System.out.println("Количество записей должно быть положительным");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ошибка в формате");
            }
        }
        int counter2=0;
        while (counter2<size2)
        {
            System.out.println("Ключ:");
            String k = input.nextLine();
            int v =-1;
            while (v<0)
            {
                System.out.println("Значение:");
                try {
                    v=Integer.parseInt(input.nextLine());
                    if (v<0)
                    {
                        System.out.println("Значение должно быть неотрицательным");
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Ошибка в формате");
                }
            }
            m2.put(k,v);
            counter2++;
        }
        Map<String,Integer> result = addValuesTwoHashMaps(m1,m2);
        System.out.println("\nHashMap1:");
        for (Map.Entry<String,Integer> e: m1.entrySet())
        {
            System.out.println(e.getKey() + ": "+e.getValue());
        }
        System.out.println("\nHashMap2:");
        for (Map.Entry<String,Integer> e:m2.entrySet())
        {
            System.out.println(e.getKey()+": "+e.getValue());
        }
        System.out.println("\nResult HashMap:");
        for (Map.Entry<String,Integer> e:result.entrySet())
        {
            System.out.println(e.getKey()+": "+e.getValue());
        }
        input.close();
    }
}

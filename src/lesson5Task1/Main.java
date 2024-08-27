package lesson5Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] val = getInputArray("Количество значений: ",input);
        int[] wei = getInputArray("Количество весов: ",input);
        if (val.length!=wei.length)
        {
            System.out.println("Количество значений и весов не совпадает");
            return;
        }
        ReturnDependingOnWeights ret = new ReturnDependingOnWeights(val,wei);
        int tries = getPositiveInt("Количество случайных значений которое Вы хотите получить",input);
        int[] counter = new int[val.length];
        for (int i=0;i<tries;i++)
        {
            int rand = ret.randomizer();
            System.out.println("Случайное значение: "+rand);
            for (int j =0;j<val.length;j++)
            {
                if (val[j] == rand)
                {
                    counter[j]++;
                    break;
                }
            }
        }
        for (int i = 0; i<val.length;i++)
        {
            System.out.println("Значение " + val[i] + " нашлось " + counter[i] +" раз");
        }
        input.close();
    }
    public static int[] getInputArray(String str,Scanner sc)
    {
        int size = getPositiveInt(str,sc);
        int[] arr = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i] = getInt("Элемент "+ (i+1) +": ",sc);
        }
        return arr;
    }
    public static int getPositiveInt(String str,Scanner sc)
    {
        int n;
        while (true)
        {
            System.out.println(str);
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n>0)
                {
                    return n;
                }
                else
                {
                    System.out.println("Неположительное число");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ошибка в формате");
            }
        }
    }
    public static int getInt(String str,Scanner sc)
    {
        while (true)
        {
            System.out.println(str);
            try {
                return Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ошибка в формате");
            }
        }
    }
}

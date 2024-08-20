package lesson4Task6;
import java.util.*;
public class arrayOperations {
    public static int[] generate(int n)
    {
        int[] myArr = new int[n];
        for (int i=0;i<n;i++)
        {
            myArr[i] =(int) (Math.random()*21)-10;
        }
        return myArr;
    }
    public static int[] removeAndAdd(int[] myArr)
    {
        int counter = 0;
        for(int i:myArr)
        {
            if(i!=0)
            {
                counter++;
                if(Math.abs(i)%10 == 5)
                {
                    counter++;
                }
            }
        }
        int[] res = new int[counter];
        int index =0;
        for (int i:myArr)
        {
            if (i!=0)
            {
                res[index++]=i;
                if(Math.abs(i)%10==5)
                {
                    res[index++]=1;
                }
            }
        }
        return res;
    }
    public static void modify(int[] arr, int a,int b)
    {
        for (int i=a;i<=b;i++)
        {
            if(arr[i]%2==0)
            {
                int l =(i>0)?arr[i-1]:0;
                int r =(i<arr.length-1)?arr[i+1]:0;
                arr[i] = l+r;
            }
        }
    }
    public static int[] removeSeg(int[] arr)
    {
        int maximumIndex = findFirstIndex(arr,Arrays.stream(arr).max().getAsInt());
        int minimumIndex = findFirstIndex(arr,Arrays.stream(arr).min().getAsInt());
        if (maximumIndex>minimumIndex)
        {
            int t = maximumIndex;
            maximumIndex=minimumIndex;
            minimumIndex=t;
        }
        int[] newArr = new int[arr.length-(minimumIndex-maximumIndex+1)];
        int j=0;
        for (int i =0;i<arr.length;i++)
        {
            if(i<maximumIndex||i>minimumIndex)
            {
                newArr[j++]=arr[i];
            }
        }
        return newArr;
    }
    public static int findFirstIndex(int[]arr,int a)
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                return i;
            }
        }
        return -1;
    }
    public static void reverse(int[] arr)
    {
        for (int i=0;i<arr.length/2;i++){
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
    }
    public static int countChetnyeNaCChetnihPosiciyah(int[] arr)
    {
        int counter =0;
        for(int i=0;i<arr.length;i+=2)
        {
            if (arr[i]%2==0)
            {
                counter++;
            }
        }
        return counter;
    }
    public static List<Integer> findElementsWithLastDigit(int[] arr)
    {
        int lastD = Math.abs(arr[0])%10;
        List<Integer> lst = new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            int counter = 0;
            int temp =Math.abs(arr[i]);
            while (temp>0)
            {
                if(temp%10==lastD)
                {
                    counter++;
                }
                temp/=10;
            }
            if(counter==2)
            {
                lst.add(i);
            }
        }
        return lst;
    }
    public static List<Integer> findElementsDevided3And5(int[] arr)
    {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i]%3==0 && arr[i]%5==0)
            {
                lst.add(i);
            }
        }
        return lst;
    }
    public static int countExactNumber(int[] arr,int d)
    {
        int counter =0;
        for(int i:arr)
        {
            if(i==d)
            {
                counter++;
            }
        }
        return counter;
    }
    public static Set<Integer> dublicates (int[] arr)
    {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> dublicates = new HashSet<>();
        for(int i:arr)
        {
            if(!unique.add(i))
            {
                dublicates.add(i);
            }
        }
        return dublicates;
    }
    public static List<Integer> filtration(int[] arr)
    {
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>=i)
            {
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = null;
        while (myArr == null)
        {
            System.out.println("Введите размер массива: ");
            try {
                int size = input.nextInt();
                if(size>0)
                {
                    myArr = generate(size);
                    System.out.println("Массив: "+Arrays.toString(myArr));
                }
                else
                {
                    System.out.println("Размер массива должен быть положительным");
                }
            }catch (InputMismatchException e)
            {
                System.out.println("Ошибка формата");
                input.next();
            }
        }
        myArr=removeAndAdd(myArr);
        System.out.println("Убрали 0 добавили 1 "+ Arrays.toString(myArr));
        while (true)
        {
            System.out.println("Введите a и b для изменения диапазона (0 ≤ a ≤ b < длина массива): ");
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                if (a >= 0 && b < myArr.length && a <= b) {
                    modify(myArr, a, b);
                    System.out.println("После изменения элементов из диапазона: " + Arrays.toString(myArr));
                    break;
                } else {
                    System.out.println("Индексы должны быть в пределах массива и a ≤ b.");
                }
            }catch (InputMismatchException e){
                    System.out.println("Ошибка формата");
                    input.next();
            }
        }
        myArr=removeSeg(myArr);
        System.out.println("После удаления сегмента: "+Arrays.toString(myArr));
        reverse(myArr);
        System.out.println("Перевернутый: "+Arrays.toString(myArr));
        int counter = countChetnyeNaCChetnihPosiciyah(myArr);
        System.out.println("Количество чётных элементов на чётных позициях: "+counter );
        List<Integer> lst1 = findElementsWithLastDigit(myArr);
        System.out.println("Индексы элементов с двумя вхождениями последней цифры первого элемента: " + lst1);
        List<Integer> lst2 = findElementsDevided3And5(myArr);
        System.out.println("Индексы элементов, кратных 3 и 5: " + lst2);
        int number = -1;
        boolean valid = false;
        while (!valid)
        {
            System.out.println("Число для поиска: ");
            String str = input.nextLine();
            try {
                number = Integer.parseInt(str);
                valid = true;
            } catch (NumberFormatException e)
            {
                System.out.println("Ошибка формата");
            }
        }
        int counterExact = countExactNumber(myArr,number);
        System.out.println("Количество вхождений цифры " + number + ": " + counterExact);
        Set<Integer> dublicates = dublicates(myArr);
        System.out.println("Повторяющиеся элементы: " + dublicates);
        List<Integer> filtered = filtration(myArr);
        System.out.println("Элементы, удовлетворяющие условию array[i] >= i: " + filtered);
        input.close();
    }
}

package lesson4Task4;
import java.util.*;
public class FindStudentsThatHaveSuchMarksUsingHashMapAndSet {
    public static Map<String,Set<Integer>> studentsAndGrades(Scanner sc)
    {
        Map<String,Set<Integer>> studAndGr = new HashMap<>();
        while (true)
        {
            System.out.print("Введите имя студента (или 'выход' для окончания ввода): ");
            String student = sc.nextLine();
            if (student.equalsIgnoreCase("выход"))
            {
                break;
            }
            Set<Integer> marks = studAndGr.computeIfAbsent(student,k-> new HashSet<>());
            while (true)
            {
                System.out.print("Введите оценку для " + student+" (или конец для окончания ввода): ");
                String mark = sc.nextLine();
                if (mark.equalsIgnoreCase("конец"))
                {
                    break;
                }
                try {
                    int ocenka = Integer.parseInt(mark);
                    if (ocenka>=0)
                    {
                        marks.add(ocenka);
                    }
                    else
                    {
                        System.out.println("Оценка не может быть отрицательной");
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Ошибка в формате");
                }
            }
        }
        return studAndGr;
    }
    public static List<String> search(Map<String,Set<Integer>> marks,int mark)
    {
        List<String> res = new ArrayList<>();
        for (Map.Entry<String,Set<Integer>> e: marks.entrySet())
        {
            if(e.getValue().contains(mark))
            {
                res.add(e.getKey());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,Set<Integer>> register = studentsAndGrades(input);
        System.out.println("\nСписок студентов с их оценками:");
        for (Map.Entry<String,Set<Integer>> e :register.entrySet())
        {
            System.out.println(e.getKey()+": "+e.getValue());
        }
        System.out.println("\nВведите оценку, которую ищем: ");
        int mark =-1;
        while (mark<0)
        {
            try {
                mark = Integer.parseInt(input.nextLine());
                if (mark<0)
                {
                    System.out.println("Оценка не может быть отрицательной");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ошибка в формате");
            }
        }
        List<String> stud=search(register,mark);
        System.out.println("Студенты с оценкой "+mark+":");
        if (stud.isEmpty())
        {
            System.out.println("Студентов нет");
        }
        else
        {
            for (String i: stud)
            {
                System.out.println(i);
            }
        }
        input.close();
    }
}

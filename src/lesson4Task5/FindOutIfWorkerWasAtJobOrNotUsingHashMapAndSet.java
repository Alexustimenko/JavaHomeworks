package lesson4Task5;
import java.util.*;
public class FindOutIfWorkerWasAtJobOrNotUsingHashMapAndSet
{
    public static Map<String,Set<String>> workers(Scanner sc)
    {
        Map<String,Set<String>> WorkersWithDates = new HashMap<>();
        while (true)
        {
            System.out.println("Введите фамилию сотрудника (или 'выход' для окончания ввода)");
            String surname = sc.nextLine();
            if (surname.equalsIgnoreCase("выход"))
            {
                break;
            }
            Set<String> datas = WorkersWithDates.computeIfAbsent(surname,k->new HashSet<>());
            while (true)
            {
                System.out.println("Введите дату, когда " + surname + " был на работе или конец для окончания ввода");
                String data = sc.nextLine();
                if (data.equalsIgnoreCase("конец"))
                {
                    break;
                }
                if (data.matches("\\d{4}-\\d{2}-\\d{2}"))
                {
                    datas.add(data);
                }
                else
                {
                    System.out.println("Ошибка в формате. Формат для даты: ГГГГ-ММ-ДД");
                }
            }
        }
        return WorkersWithDates;
    }
    public static boolean wasAtWork(Map<String,Set<String>> datesWithWorkers,String worker,String data)
    {
        Set<String> dates = datesWithWorkers.get(worker);
        return dates!=null && dates.contains(data);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,Set<String>> workersWithDates=workers(input);
        System.out.println("\nСписок сотрудников с датами их работы:");
        for (Map.Entry<String,Set<String>> e:workersWithDates.entrySet())
        {
            System.out.println(e.getKey() + ": "+e.getValue());
        }
        System.out.println("\nВведите имя сотрудника для проверки: ");
        String worker = input.nextLine();
        System.out.println("Введите дату для проверки в формате ГГГГ-ММ-ДД ");
        String data = input.nextLine();
        if (wasAtWork(workersWithDates,worker,data))
        {
            System.out.println(worker + " был на работе " + data);
        }
        else
        {
            System.out.println(worker + " не был на работе " + data);
        }
        input.close();
    }
}

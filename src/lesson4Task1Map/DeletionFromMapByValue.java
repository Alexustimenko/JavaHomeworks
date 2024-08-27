package lesson4Task1Map;
import java.util.Scanner;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DeletionFromMapByValue {
    public static void removeByValue(Map<String,Date> map)
    {
        String[] remove = new String[map.size()];
        int index = 0;
        for (Map.Entry<String,Date> entry: map.entrySet())
        {
            Date data = entry.getValue();
            int month = data.getMonth();
            if (month>=5&&month<=7)
            {
                remove[index++]=entry.getKey();
            }
        }
        for (int i=0;i<index;i++)
        {
            map.remove(remove[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
        data.setLenient(false);
        Map<String,Date> database = new HashMap<>();
        System.out.println("Введите сколько записей Вы хотите сохранить в базу:");
        int size = -1;
        while (size<1)
        {
            try {
                size=Integer.parseInt(input.nextLine());
                if (size<1)
                {
                    System.out.println("Количество записей должно быть положительным");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Неверный формат");
            }
        }
        for (int i = 0; i < size; i++) {
            String surname;
            Date birth = null;
            System.out.println("Фамилия:");
            while (true)
            {
                surname=input.nextLine();
                if (!surname.trim().isEmpty())
                {
                    break;
                }
                System.out.println("Фамилия не привильная");
            }
            System.out.println("Дата рождения: (Формат: дд-мм-гггг)");
            while (true){
                String bithday = input.nextLine();
                try {
                    birth = data.parse(bithday);
                    break;
                }
                catch (ParseException e)
                {
                    System.out.println("Неправильная дата");
                }
            }
            database.put(surname,birth);
        }
        System.out.println("\nДо удаления:");
        for (Map.Entry<String,Date> e:database.entrySet())
        {
            System.out.println(e.getKey()+": "+data.format(e.getValue()));
        }
        removeByValue(database);
        System.out.println("\nПосле удаления:");
        for (Map.Entry<String,Date> e:database.entrySet()){
            System.out.println(e.getKey()+": "+data.format(e.getValue()));
        }
        input.close();
    }
}

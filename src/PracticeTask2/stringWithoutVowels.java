package PracticeTask2;

public class stringWithoutVowels {
    public static String cleanString(String str)
    {
        String vovels ="аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU";
        StringBuilder builder = new StringBuilder();
        for(char i: str.toCharArray())
        {
            if(vovels.indexOf(i)==-1)
            {
                builder.append(i);
            }
        }
        return builder.toString();
    }
    public static boolean ckeckUnique(String str)
    {
        for (int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    System.out.println("nou unique");
                    return false;
                }
            }
        }
        System.out.println("Unique");
        return true;

    }
    public static String szhatStroku(String str)
    {
        if (str == null || str.isEmpty())
        {
            return str;
        }
        StringBuilder builder = new StringBuilder();
        int counter = 1;
        for (int i =0;i<str.length();i++)
        {

            if(i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1))
            {
                counter++;

            }
            else
            {
                builder.append(str.charAt(i));
                if(counter> 1)
                {
                    builder.append(counter);
                }

                counter=1;
            }
        }


        return builder.toString();
    }
    public static void main(String[] args) {
        String str1="Hello Привет";
        String str2="Abc";
        System.out.println(str1);
        System.out.println(cleanString(str1));
        System.out.println(ckeckUnique(str1));
        System.out.println(ckeckUnique(str2));
        String str3 = "";
        System.out.println(szhatStroku(str3));
    }
}

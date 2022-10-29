import java.util.Arrays;

public class Split {



    /**14.Напишите метод, который принимает на вход предложение и возвращает слова
     *  из этого предложения в виде массива слов
     Test Data:
     “QA for Everyone” → {“QA”, “for”, “Everyone”}
     “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}*/

String[] zero = new String[]{"Пустая строка"};
    public String split(String text) {

        if (!text.isEmpty()) {


            String[] str = text.split(" ");

            return Arrays.toString(str) + "";
        }

        return "Пустая строка";
    }



    /**15.Написать метод, который принимает на вход предложение, которое состоит из имени,
     *  фамилии, отчества и возвращает текст:
     Test Data:
     “Александр Сергеевич Пушкин” →

     “Имя: Александр
     Отчество: Сергеевич
     Фамилия: Пушкин”*/

    public String splitName (String text) {
        if (!text.isEmpty()) {
            String str = "Имя: " + text.substring(0, text.indexOf(" "))
                    + "\nОтчество:" + text.substring(text.indexOf(" "), text.lastIndexOf(" "))
                    + "\nФамилия:" + text.substring(text.lastIndexOf(" ") );

            return str;

        }

        return "Пустая строка";
    }



}

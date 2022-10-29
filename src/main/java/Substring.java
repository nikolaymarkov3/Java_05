public class Substring {


    /**12.12.Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом,
     *  и возвращает последнее слово
     Test Data:
     “Red Rover” → “Rover”*/

    public String substringOn (String text){

        if (!text.isEmpty()) {
            String str = text.substring(text.indexOf(" ") +1);

            return str;
        }

        return "Пустая строка";
    }

    /**13. 13.Написать метод, который принимает строку, и 2 индекса.
     * Метод удаляет все, что находится между двумя индексами включительно
     Test Data:
     “Red rover”, 1, 4 → “Rover”*/

    public String substringTree (String text, int ind, int ind1){

        if (!text.isEmpty()) {
            String str = text.substring(0,ind)  + text.substring(ind1 + 1);

            return str;
        }

        return "Пустая строка";
    }


}

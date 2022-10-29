public class IndexOf {

    /**10. Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
     *  что находится между первой и последней буквой-параметром:
     *      Test Data:
     *      “Abracadabra”, “b” → “bracadab”
     *      “Whippersnapper”, “p” → “ppersnapp”*/



    public String indexOf (String text, String letter) {

        if (!text.isEmpty()){

            String str = text.substring(text.indexOf(letter), text.lastIndexOf(letter) + 1);

            return str;
        }

        return "Пустая строка";
    }

    /**11.Напишите метод, который принимает на вход слово, и возвращает true,
     * если слово начинается и заканчивается на одинаковую букву, и false иначе
     Test Data:
     “Abracadabra” → true
     “Whippersnapper” → false*/



    public String lastIndexOf (String text) {

        if (!text.isEmpty() && text.toUpperCase().charAt(0)==text.toUpperCase().charAt(text.length() - 1)){

            return "true";
        }else {

            return "false";
        }

//        return "Пустая строка";
    }

}

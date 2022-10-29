public class InsertQuotes {

    /**Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     *  в которой это слово “обернуто” в кавычки:
     Test Data:
     “Abracadabra” →  ““Abracadabra””*/

    public String insertQuotes (String text) {
        if (!text.isEmpty()){
            String strN = "".concat("\"") + text.substring(0,11).concat("\"");

            return strN;
        }

        return "Пустая строка";
    }


    /**8. Напишите метод insertQuotes(), который принимает на вход две строки,
     *  и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
     (результат строится с помощью метода concat())

     Test Data:
     “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     Задание со звездочкой:
     “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""*/
    public String insertQuotes (String text, String text1) {
        if (!text.isEmpty()){
            String strN = text.concat(": ").concat("".concat("\"")
                    + text1.substring(0,24).concat(" \"") + text1.substring(25,35).concat("\"")
                    + text1.substring(35).concat("\""));

            return strN;
        }

        return "Пустая строка";
    }


    /**9.Напишите метод, кторый принимает на вход название города и исправляет написание:
    Test Data:
            “ташкент” → “Ташкент”
            “ЧикаГО” → “Чикаго”*/

    public String insertTown (String town) {

        if (!town.isEmpty()){
            String str = town.toUpperCase().charAt(0) + town.substring(1);

            return str;
        }

        return "Пустая строка";

    }



}

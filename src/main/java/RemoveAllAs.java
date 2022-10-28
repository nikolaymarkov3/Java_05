public class RemoveAllAs {

    /**2.Написать алгоритм removeAllAs().
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
     Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
     Метод возвращает обработанную строку.
     Test Data:
     “    Red Rover School   “ →  “Red Rover School“
     “panda   “ → “pnd”
     “taramasalata” → “trmslt”*/

    public String removeAllAs(String text) {
//        String b = null;
//        String a = null;
        if (!text.isEmpty()){
            String b = text.trim();
            String a = b.replace("a", "");

            return a;
        }

        return "Пустая строка";
    }
}

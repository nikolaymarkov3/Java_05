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
        if (!text.isEmpty()){
            String b = text.trim().replace("a","");

            return b;
        }

        return "Пустая строка";
    }
}

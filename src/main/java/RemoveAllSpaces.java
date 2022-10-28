public class RemoveAllSpaces {


    /**4.Написать алгоритм removeAllSpaces.
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
     Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     Метод возвращает обработанную строку.
     Test Data:
     “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     “p a     n   d a   “ → “panda”*/

    public String removeAllSpaces (String text) {

        if (!text.isEmpty()){

            String str = text.replace(" ","");

            return str;
        }

        return "Пустая строка";
    }




















}

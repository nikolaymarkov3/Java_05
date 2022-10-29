public class CountAs {


    /**5.Напишите метод countAs(), который принимает на вход строку и считает,
     * сколько букв а или А содержится в строке. Метод возвращает количество букв a/A,
     * и количество букв/знаков в слове без букв a/A. Итоговый результат должен строится с помощью метода из видео 2.
     Test Data:
     “Abracadabra” → “5, 6”
     “Homenum Revelio” → “0, 15”
     “3 tarAmasAlatA” → “6, 8”*/

    public String countAs(String text){


        if (!text.isEmpty()) {

            int str = text.length() - text.toLowerCase().replace("a", "").length();/**считаем количество букв а*/

            int str1 = text.length() - str;

            return "" + str + ", " + str1;

        }

        return "Пустая строка";
    }






















}

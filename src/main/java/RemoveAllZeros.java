public class RemoveAllZeros {

    /**3.Написать алгоритм removeAllZeros().
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
     состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
     метод возвращает сообщение “This is a valid string”.
     Test Data:
     “3504209706040000 “ →  “35429764“
     “0000000111“ → “111”*/


    public String removeAllZeros(String text){

        String str = text.trim().replace("0", "");

        if (!text.isEmpty() && text.equals(str)) {/**Если в строке нет нулей*/

            return "This is a valid string";
        }

        return str;
    }

//    int indexM = text.indexOf("0");/**Если в строке не было нулей*/

//        text.indexOf("0");
//        if (!text.isEmpty() && indexM == -1){/**indexM == -1 = Если в строке неn нулей*/
//
//
//
//            return "This is a valid string";
//        }
//
//        return  b.replace("0", "");




//    }







}

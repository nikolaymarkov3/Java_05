import java.util.Arrays;

public class Oracle {

    /**
     * 16. Написать метод, который принимает на вход слово и число n,
     * и возвращает строку, где слово повторяется n раз.
     * Test Data:
     * “one”, 5 → “oneoneoneoneone”
     */


    public String oracleOneN (String text, int n) {
        if (!text.isEmpty()) {
            String str = text.repeat(n);

            return str;
        }

        return "Пустая строка";
    }



    /** 17.Напишите метод, который принимает строку и index, и возвращает численное значение буквы,
     *  которая находится на позиции index (использовать только один метод класса String)*/

    public int indexStr (String text, int index) {

        if (!text.isEmpty()) {
           int str = text.codePointAt(index);

            return str;
        }

        return 0;
    }


    /**18. Написать метод, который принимает 3 слова, и сравнивает их методом, который считает,
     *  что прописные и заглавные буквы - это одни и те же буквы. Метод возвращает true,
     *  если все слова одинаковы, и метод возвращает false, если слова не одинаковы:
     Test Data:
     “one”, “One”, “ONE”  → true
     “one”, “Один”, “ONE” → false*/


    public String treeStr (String text, String t1, String t2) {
        if (!text.isEmpty() && !t1.isEmpty() && !t2.isEmpty() && t1.equalsIgnoreCase(t2) && text.equalsIgnoreCase(t1)) {

                    return "true";
                }

        return "false";
    }















}

public class OddEvenValuesInArray {

    /**
     * 1.10.	Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] num) {


        int[] arrayOdd;
        int odd = 0;

        for (int i = 0; i <= num.length; i++) {
            if (i % 2 == 0) { /**задаем длинну массива*/

                odd++;
            }
        }

        return odd;
    }




    /**1.11.	Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
     *  и возвращает количество нечетных чисел в этом массиве*/

    public int countOddValuesInArray(int[] num) {

        int odd = 0;

        for (int i = 0; i <= num.length; i++) {
            if (i % 2 == 0) { /**задаем длинну массива*/

                odd++;
            }
        }

        return num.length - odd;
    }
}


    /**1.12.	В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     который принимает на вход массив целых чисел и число number.
     Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false
     */




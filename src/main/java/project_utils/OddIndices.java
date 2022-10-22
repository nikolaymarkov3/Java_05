package project_utils;

public class OddIndices {


    /**Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
     Test Data:
     Input = {-45, 590, 234, 985, 12, 68}
     Expected Result =  {590, 985, 68}
     */
//
    public int[] oddIndices (int[] array) {

//        int[]  arrayOdd;
        int odd = 0;

        for (int i = 0; i <= array.length; i ++){
            if (i % 2 != 0){ /**задаем длинну массива*/

                odd ++;
            }
        }

        int[] arrayOdd = new int[odd];
        int oddInt = 0;

        for (int i = 0; i <= array.length && oddInt <= odd; i ++) {

            if (i % 2 == 0) {

                continue;

            } else {

                arrayOdd[oddInt] = array[i];/**заполняем массив*/
            }
            oddInt ++;
        }

        return arrayOdd;
    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
}

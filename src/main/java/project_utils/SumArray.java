package project_utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumArray {

    /**3.	Написать алгоритм SumArray, который возвращает сумму всех чисел массива

     Test Data:
     {0, 1, 2, 3, 4, 5} → 15
     {-7, -3} → -10
     */

    public int sumArray(int[] array){

        int odd = 0;

        for (int i = 0; i <= array.length; i ++){
               odd ++;/**задаем длинну массива*/
        }

        int[] arrayOdd = new int[odd];
//        arrayOdd = {array};
        int sum = 0;
        int oddInt = 0;

        for (int i = 0; i < array.length; i ++) {

                arrayOdd[oddInt] = array[i];

                /**заполняем массив*/
            oddInt ++;
            sum = sum + arrayOdd[i];/***/
            }

//        return Arrays.stream(arrayOdd).sum();
        return sum;
    }









    }















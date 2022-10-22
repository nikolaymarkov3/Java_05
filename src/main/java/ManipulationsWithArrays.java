import java.util.Arrays;

public class ManipulationsWithArrays {

    /**1.5.	Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     *  Метод возвращает массив тех же чисел, умноженных на number
     Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    public int[] multiplyArrayByNumber(int[] q, int number){

        int[] byNumber = new int[q.length];

        int arrayBy = 0;

        for (int i = 0; i < q.length; i ++ ){

            byNumber[arrayBy] = q[i] * number;
            arrayBy ++;
        }

        return byNumber;
    }


    /**1.6.	Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
     *  и возвращает массив типа double[] из тех же чисел
     a.	Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray(int[] number){
        double[] toDoubleArray = new double[number.length];/**Задаем длинну массива*/
//        double[] toDoubleArray = new double[number.length];
//        toDoubleArray = Arrays.stream(number).asDoubleStream().toArray();
        for(int i = 0; i < number.length; i++) {
            toDoubleArray[i] = number[i];
        }
        return toDoubleArray;
    }



}

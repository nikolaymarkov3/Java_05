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

    /**7.	Написать метод toIntArray(), который принимает на вход массив типа double[],
     *  и возвращает массив типа int[] из тех же чисел
     Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    public int[] toIntArray(double[] number){
        int[] toIntArray = new int[number.length];/**Задаем длинну массива*/
//        double[] toDoubleArray = new double[number.length];
//        toDoubleArray = Arrays.stream(number).asDoubleStream().toArray();
        for(int i = 0; i < number.length; i++) {
            toIntArray[i] = (int) number[i];
        }
        return toIntArray;
    }


    /**1.8.	Написать метод toStringArray(), который принимает на вход массив целых чисел,
     *  и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
     *  нужно переводить вручную)
     Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */

    public String[] toStringArray(int[] num){

        String[] toStringAr = new String[num.length];/**Задаем длинну массива*/
//        double[] toDoubleArray = new double[number.length];
//        toDoubleArray = Arrays.stream(number).asDoubleStream().toArray();
        for(int i = 0; i < num.length; i++) {
            toStringAr[i] = String.valueOf(num[i]);
        }
        return toStringAr;
    }


    /**1.9.	Перегрузить метод toStringArray() параметром double[].
     *  Этот метод должен возвращать массив типа String[] (желательно не использовать метод .toString(),
     *  нужно переводить вручную)
     Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    public String[] toStringArray(double[] num){

        String[] toStringAr = new String[num.length];/**Задаем длинну массива*/
//        double[] toDoubleArray = new double[number.length];
//        toDoubleArray = Arrays.stream(number).asDoubleStream().toArray();
        for(int i = 0; i < num.length; i++) {
            toStringAr[i] = String.valueOf(num[i]);
        }
        return toStringAr;
    }

    /**1.12.	В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     который принимает на вход массив целых чисел и число number.
     Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false
     */

    public String areValuesGreaterThanNumber(int[] num, int number){

//        int[] byNumber = new int[num.length];

//        int arrayBy = 0;

        for (int i = 0; i < num.length && num[i] > number; i ++ ){

            return "true";
        }

        return "false";
    }






}

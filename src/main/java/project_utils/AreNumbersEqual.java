package project_utils;

public class AreNumbersEqual {

    /**6. Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     0, если числа равны
     -1, если первое число меньше второго
     1, если первое число больше второго
     Test Data:
     89, 89
     Expected result: 0
     -89, 89
     Expected result: -1
     89, -89
     Expected result: 1
     */
    public int areNumbersEqual (int n, int m) {

        int result;
        if (n == m) {
            result = Integer.compare(n, m);
        } else if (n < m){

            result = Integer.compare(n, m);
        } else {

            result = Integer.compare(n, m);
        }

        return result;

    }



}

package project_utils;

public class IsPositiveNumber {

    /**5.	Напишите алгоритм IsPositiveNumber, который возвращает true,
     *  если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
     Проверьте работу метода на числах 555, 0 и -555.
     */

    public String isPositiveNumber(int number){

        if (number >= 0) {

            return "true";
        }

        return "false";
    }



}

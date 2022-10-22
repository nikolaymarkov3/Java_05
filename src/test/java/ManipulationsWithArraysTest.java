import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    /**
     * 1.5.	Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     * Метод возвращает массив тех же чисел, умноженных на number
     * Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    @Test
    public void testMultiplуArrayByNumber_HappyPath() {

        int[] arrayBy = new int[]{1, 2, 3, 4, 5};
        int number = 3;

        int[] expectResult = new int[]{3, 6, 9, 12, 15};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(arrayBy, number);

        Assert.assertEquals(expectResult, actualResult);


    }

    /**
     * 1.6.	Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
     * и возвращает массив типа double[] из тех же чисел
     * a.	Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    @Test
    public void testToDoubleArray_HappyPath() {

        int[] arrayBy = new int[]{1, 2, 3, 4, 5};
//        int number = 3;

        double[] expectResult = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(arrayBy);

        Assert.assertEquals(expectResult, actualResult);

    }
}

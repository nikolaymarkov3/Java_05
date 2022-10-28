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


    /**1.7.	Написать метод toIntArray(), который принимает на вход массив типа double[],
     *  и возвращает массив типа int[] из тех же чисел
     Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    @Test
    public void testToIntArray_HappyPath() {

        double[] arrayBy = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
//        int number = 3;

        int[] expectResult = new int[]{1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(arrayBy);

        Assert.assertEquals(expectResult, actualResult);

    }

    /**1.8.	Написать метод toStringArray(), который принимает на вход массив целых чисел,
     *  и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
     *  нужно переводить вручную)
     Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */
    @Test
    public void testToStringArray_HappyPath() {

        int[] arrayBy = new int[]{1, 2, 3, 4, 5};
//        int number = 3;

        String[] expectResult = new String[]{"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(arrayBy);

        Assert.assertEquals(expectResult, actualResult);

    }

    /**1.9.	Перегрузить метод toStringArray() параметром double[].
     *  Этот метод должен возвращать массив типа String[] (желательно не использовать метод .toString(),
     *  нужно переводить вручную)
     Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    @Test
    public void testToStringArrayD_HappyPath() {

        double[] arrayBy = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
//        int number = 3;

        String[] expectResult = new String[]{"1.1", "2.5", "3.7", "4.0", "5.5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(arrayBy);

        Assert.assertEquals(expectResult, actualResult);

    }

    /**1.12.	В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     который принимает на вход массив целых чисел и число number.
     Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false
     */

    @Test
    public void testManipulationsWithArrays_HappyPath() {

        int[] arrayBy = new int[]{1, 2, 3, 4, 5};
        int number = 0;

        String expectResult = "true";

        String actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(arrayBy,number);

        Assert.assertEquals(expectResult, actualResult);

    }

    @Test
    public void testManipulationsWithArrays1_HappyPath() {

        int[] arrayBy = new int[]{1, 2, 3, 4, 5};
        int number = 2;

        String expectResult = "false";

        String actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(arrayBy,number);

        Assert.assertEquals(expectResult, actualResult);

    }

    @Test
    public void testManipulationsWithArrays2_HappyPath() {

        int[] arrayBy = new int[]{1, 2, 3, 4, 5};
        int number = 0;

        String expectResult = "true";

        String actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(arrayBy,number);

        Assert.assertEquals(expectResult, actualResult);

    }




}

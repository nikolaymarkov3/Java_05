import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddIndices;

public class OddEvenValuesInArrayTest {

    /**
     * 1.10.	Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество четных чисел в этом массиве
     */

    @Test
//    @Ignore

    public void  testOddEvenValuesInArrayTest_HappyPath(){

        int[] number = new int[]{-45, 590, 234, 985, 12, 68};

        int expectedResult = 4;
        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    /**1.11.	Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
     *  и возвращает количество нечетных чисел в этом массиве*/

    @Test
//    @Ignore

    public void  testCountOddValuesInArray_HappyPath(){

        int[] number = new int[]{-45, 590, 234, 985, 12, 68};

        int expectedResult = 2;
        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}

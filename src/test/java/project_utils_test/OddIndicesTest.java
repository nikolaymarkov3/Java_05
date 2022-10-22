package project_utils_test;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import project_utils.OddIndices;

public class OddIndicesTest {


    /**Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
     Test Data:
     Input = {-45, 590, 234, 985, 12, 68}
     Expected Result =  {590, 985, 68}
     */
    @Test
//    @Ignore

    public void  testOddIndicesTest_HappyPath(){

        int[] number = new int[]{-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};
        //act
        int[] actualResult = new OddIndices().oddIndices(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}

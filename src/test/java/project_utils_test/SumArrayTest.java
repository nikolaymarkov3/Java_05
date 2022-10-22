package project_utils_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddIndices;
import project_utils.SumArray;

public class SumArrayTest {


    /**3.	Написать алгоритм SumArray, который возвращает сумму всех чисел массива

     Test Data:
     {0, 1, 2, 3, 4, 5} → 15
     {-7, -3} → -10
     */
    @Test
//    @Ignore

    public void  testSumArrayTest_HappyPath(){

        int[] number = new int[]{0, 1, 2, 3, 4, 5};

        int expectedResult = 15;
        //act
        int actualResult = new SumArray().sumArray(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
//    @Ignore

    public void  testSumArrayTest1_HappyPath(){

        int[] number = new int[]{-7, -3};

        int expectedResult = - 10;
        //act
        int actualResult = new SumArray().sumArray(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }







}

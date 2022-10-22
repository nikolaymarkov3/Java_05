package project_utils_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.IsPositiveNumber;

public class IsPositiveNumberTest {

    /**5.	Напишите алгоритм IsPositiveNumber, который возвращает true,
     *  если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
     Проверьте работу метода на числах 555, 0 и -555.
     */
@Test
    public void testIsPositiveNumber_HappyPath(){

        //AAA
        //arrange
        int number = 555;

        String expectedResult = "true";

        //act

        String actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testIsPositiveNumberEqZero_HappyPath(){

        //AAA
        //arrange
        int number = 0;

        String expectedResult = "true";

        //act

        String actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testIsPositiveNumberMinus_HappyPath(){

        //AAA
        //arrange
        int number = - 555;

        String expectedResult = "false";

        //act

        String actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }
 }



package project_utils_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;
import project_utils.IsPositiveNumber;

public class AreNumbersEqualTest {

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


@Test
public void testAreNumbersEqual_HappyPath(){

    //AAA
    //arrange
    int n = 89;
    int m = 89;

    int expectedResult = 0;

    //act

    int actualResult = new AreNumbersEqual().areNumbersEqual(n, m);

    //Assert

    Assert.assertEquals(expectedResult,actualResult);

}

    @Test
    public void testAreNumbersMinusOne_HappyPath(){

        //AAA
        //arrange
        int n = - 89;
        int m = 89;

        int expectedResult = - 1;

        //act

        int actualResult = new AreNumbersEqual().areNumbersEqual(n, m);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }


    @Test
    public void testAreNumbersPlusOne_HappyPath(){

        //AAA
        //arrange
        int n = 89;
        int m = - 89;

        int expectedResult = 1;

        //act

        int actualResult = new AreNumbersEqual().areNumbersEqual(n, m);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }







}

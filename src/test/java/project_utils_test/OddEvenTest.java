package project_utils_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEvenTest {

    /**1.	В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
     *  если число нечетное, и “Even”, если число четное.

     Test Data:
     -345 →  “Odd”
     0 →  “Even”
     222222 →  “Even”
     */
    @Test

    public void oddEvenTest_HappyPath(){

        int number = - 345;

        String expectedResult = "Odd";
        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test
    public void OddEvenTestEvenZero_HappyPath() {

        int number = 0;

        String expectedResult = "Even";
        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void OddEvenTestEven_HappyPath() {

        int number = 222222;

        String expectedResult = "Even";
        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }













}

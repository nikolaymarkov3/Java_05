package project_utils_test;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import project_utils.IntegerM;

public class IntegerMTest {

    /**7. Учитывая целое число M, выполните следующие условные действия:
     ● Если M кратно 7 и 9, то верните "Хорошее число".
     ● Если M кратно только 9, а не 7, то верните "Неверное число".
     ● Если M кратно только 11, то верните "Плохое число".
     ● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"*/

    @Test

    public void testIntegerMTest_HappyPath() {
        //AAA
        //arrange
        int m = 63;

        String expectedResult = "Хорошее число";

        //act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String actualResult = new IntegerM().integerM(m);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test

    public void testIntegerMTestMultipleOfNine_HappyPath() {
        //AAA
        //arrange
        int m = 9;

        String expectedResult = "Неверное число";

        //act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String actualResult = new IntegerM().integerM(m);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }
//    @Ignore
    @Test

    public void testIntegerMTestMultipleOfEleven_HappyPath() {
        //AAA
        //arrange
        int m = 11;

        String expectedResult = "Плохое число";

        //act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String actualResult = new IntegerM().integerM(m);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }
//    @Ignore
    @Test

    public void testStartLessThanEnd_Negative() {
        //AAA
        //arrange
        int m = 1;

        String expectedResult = "-1";

        //act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String actualResult = new IntegerM().integerM(m);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);

    }



    //start == end
}

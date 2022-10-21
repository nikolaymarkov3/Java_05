import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    /**1. Positive testing Happy path
     * if (start <= end)
     * return array;
     */




    //start < end
    @Test

    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz","4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                                    "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzBuzz(start,end);

        //Assert

        Assert.assertEquals(actualResult,expectedResult);

    }








    //start == end

    /**2. Negative testing
     * if (start > end)
     * return new String[0];
     */


}

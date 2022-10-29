import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IndexOfTest {


    /**Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
     *  что находится между первой и последней буквой-параметром:
     *      Test Data:
     *      “Abracadabra”, “b” → “bracadab”
     *      “Whippersnapper”, “p” → “ppersnapp”*/

    @Test

    public void testIndexOfTestTest_HappyPath() {

        String strOne = "Abracadabra";

        String strTwo = "b";

        String expectedResult = "bracadab";
        //act
        String actualResult = new IndexOf().indexOf(strOne, strTwo);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }




    /**11.Напишите метод, который принимает на вход слово, и возвращает true,
     * если слово начинается и заканчивается на одинаковую букву, и false иначе
     Test Data:
     “Abracadabra” → true
     “Whippersnapper” → false*/
//    @Ignore
    @Test

    public void testChartIndexOfTestAbr_HappyPath(){

        String strOne = "Abracadabra";

        String strTwo = "a";

        String expectedResult = "true";
        //act
        String actualResult = new IndexOf().lastIndexOf(strOne);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
//
//
    }

    @Test

    public void testChartIndexOfTestWhi_HappyPath(){

        String strOne = "Whippersnapper";

        String strTwo = "a";

        String expectedResult = "false";
        //act
        String actualResult = new IndexOf().lastIndexOf(strOne);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
//
//
    }










}

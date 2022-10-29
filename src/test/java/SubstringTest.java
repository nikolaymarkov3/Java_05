import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstringTest {

    /**12.12.Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом,
     *  и возвращает последнее слово
     Test Data:
     “Red Rover” → “Rover”*/


    @Test

    public void testIndexOfTest_HappyPath() {

        String strOne = "Red Rover";

//        String strTwo = "b";

        String expectedResult = "Rover";
        //act
        String actualResult = new Substring().substringOn(strOne);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    /**13. 13.Написать метод, который принимает строку, и 2 индекса.
     * Метод удаляет все, что находится между двумя индексами включительно
     Test Data:
     “Red rover”, 1, 4 → “Rover”*/

    @Test

    public void testIndexOfTreeTest_HappyPath() {

        String strOne = "Red rover";

      int ind = 1;
      int ind1 = 4;

        String expectedResult = "Rover";
        //act
        String actualResult = new Substring().substringTree(strOne,ind,ind1);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }








}

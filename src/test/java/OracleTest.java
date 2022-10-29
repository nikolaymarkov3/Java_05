import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OracleTest {

/**
 * 16. Написать метод, который принимает на вход слово и число n,
 * и возвращает строку, где слово повторяется n раз.
 * Test Data:
 * “one”, 5 → “oneoneoneoneone”
 */

    @Test

    public void testOracleTest_HappyPath() {

    String strOne = "one";

    int number = 5;



    String expectedResult = "oneoneoneoneone";
    //act
    String actualResult = new Oracle().oracleOneN(strOne,number);

    //Assert
    Assert.assertEquals(actualResult, expectedResult);
}


    /** 17.Напишите метод, который принимает строку и index, и возвращает численное значение буквы,
     *  которая находится на позиции index (использовать только один метод класса String)*/
    @Test

    public void testIndexStrTest_HappyPath() {

        String strOne = "Abracadabra";

        int number = 1;



        int expectedResult = 98;
        //act
        int actualResult = new Oracle().indexStr(strOne,number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    /**18. Написать метод, который принимает 3 слова, и сравнивает их методом, который считает,
     *  что прописные и заглавные буквы - это одни и те же буквы. Метод возвращает true,
     *  если все слова одинаковы, и метод возвращает false, если слова не одинаковы:
     Test Data:
     “one”, “One”, “ONE”  → true
     “one”, “Один”, “ONE” → false*/

    @Test

    public void testTreeStrTestTrue_HappyPath() {

        String strOne = "one";
        String strTwo = "One";
        String strTree = "ONE";

        int number = 1;



        String expectedResult = "true";
        //act
        String actualResult = new Oracle().treeStr(strOne,strTwo,strTree);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test

    public void testTreeStrTestFalse_HappyPath() {

        String strOne = "one";
        String strTwo = "Один";
        String strTree = "ONE";

        int number = 1;



        String expectedResult = "false";
        //act
        String actualResult = new Oracle().treeStr(strOne,strTwo,strTree);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }







}

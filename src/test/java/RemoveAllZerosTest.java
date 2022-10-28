import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllZerosTest {

    /**3.Написать алгоритм removeAllZeros().
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
     состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
     метод возвращает сообщение “This is a valid string”.
     Test Data:
     “3504209706040000 “ →  “35429764“
     “0000000111“ → “111”*/

    @Test

    public void testRemoveAllZerosTest_HappyPath(){

        String number = "3504209706040000 ";

        String expectedResult = "35429764";
        //act
        String actualResult = new RemoveAllZeros().removeAllZeros(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void testRemoveAllZerosTestOne_HappyPath(){

        String number = "0000000111";

        String expectedResult = "111";
        //act
        String actualResult = new RemoveAllZeros().removeAllZeros(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void testRemoveAllZerosTestZero_Negative(){

        String number = "35429764";

        String expectedResult = "This is a valid string";
        //act
        String actualResult = new RemoveAllZeros().removeAllZeros(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }



















}

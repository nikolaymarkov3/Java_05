import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllAsTest {

    /**2.Написать алгоритм removeAllAs().
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
     Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
     Метод возвращает обработанную строку.
     Test Data:
     “    Red Rover School   “ →  “Red Rover School“
     “panda   “ → “pnd”
     “taramasalata” → “trmslt”*/



    @Test

    public void testRemoveSpacesTestPanda_HappyPath(){

        String number = "panda ";

        String expectedResult = "pnd";
        //act
        String actualResult = new RemoveAllAs().removeAllAs(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void testRemoveTestPanda_HappyPath(){

        String number = "panda";

        String expectedResult = "pnd";
        //act
        String actualResult = new RemoveAllAs().removeAllAs(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void testRemoveTestPanda_Negative(){

        String number = "";

        String expectedResult = "Пустая строка";
        //act
        String actualResult = new RemoveAllAs().removeAllAs(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

















}

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllSpacesTest {


/**4.Написать алгоритм removeAllSpaces.
 С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
 Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
 Метод возвращает обработанную строку.
 Test Data:
 “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
 “p a     n   d a   “ → “panda”*/

@Test

public void tesRemoveAllSpacesTest_HappyPath(){

    String str = "    R e d     Ro ve    r Sc   h ool   ";

    String expectedResult = "RedRoverSchool";
    //act
    String actualResult = new RemoveAllSpaces().removeAllSpaces(str);

    //Assert
    Assert.assertEquals(actualResult,expectedResult);


}

    @Test

    public void tesRemoveAllSpacesTestPanda_HappyPath(){

        String str = "p a     n   d a   ";

        String expectedResult = "panda";
        //act
        String actualResult = new RemoveAllSpaces().removeAllSpaces(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void tesRemoveAllSpacesTestPanda_Negative(){

        String str = "";

        String expectedResult = "Пустая строка";
        //act
        String actualResult = new RemoveAllSpaces().removeAllSpaces(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }






}

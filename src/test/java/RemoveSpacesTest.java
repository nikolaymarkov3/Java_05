import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class RemoveSpacesTest {



    @Test

    public void testRemoveSpacesTestSpace_HappyPath(){

        String number = "    Red Rover School   ";

        String expectedResult = "Лишние пробелы удалены";
        //act
        String actualResult = new RemoveSpaces().removeSpaces(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void testRemoveSpacesTestNotSpace_HappyPath(){

        String number = "Red Rover School";

        String expectedResult = "Пробелов не было";
        //act
        String actualResult = new RemoveSpaces().removeSpaces(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void testRemoveSpacesTestEmptyString_HappyPath(){

        String number = "";

        String expectedResult = "Строка пустая";
        //act
        String actualResult = new RemoveSpaces().removeSpaces(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

























}

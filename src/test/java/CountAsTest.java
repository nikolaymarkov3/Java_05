import org.testng.Assert;
import org.testng.annotations.Test;

public class CountAsTest {

    /**5.Напишите метод countAs(), который принимает на вход строку и считает,
     * сколько букв а или А содержится в строке. Метод возвращает количество букв a/A,
     * и количество букв/знаков в слове без букв a/A. Итоговый результат должен строится с помощью метода из видео 2.
     Test Data:
     “Abracadabra” → “5, 6”
     “Homenum Revelio” → “0, 15”
     “3 tarAmasAlatA” → “6, 8”*/




    @Test

    public void tesCountAsTestTestA_HappyPath(){

        String str = "Abracadabra";

        String expectedResult = "5, 6";
        //act
        String actualResult = new CountAs().countAs(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void tesCountAsTestTest3_HappyPath(){

        String str = "Homenum Revelio";

        String expectedResult = "0, 15";
        //act
        String actualResult = new CountAs().countAs(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test

    public void tesCountAsTestTestHo_HappyPath(){

        String str = "3 tarAmasAlatA";

        String expectedResult = "6, 8";
        //act
        String actualResult = new CountAs().countAs(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }




}

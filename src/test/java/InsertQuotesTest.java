import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertQuotesTest {

    /**Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     *  в которой это слово “обернуто” в кавычки:
     Test Data:
     “Abracadabra” →  ““Abracadabra””*/

    @Test

    public void tesInsertQuotesTest_HappyPath(){

        String str = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";
        //act
        String actualResult = new InsertQuotes().insertQuotes(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    /**8. Напишите метод insertQuotes(), который принимает на вход две строки,
     *  и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
     (результат строится с помощью метода concat())

     Test Data:
     “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     Задание со звездочкой:
     “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""*/


    @Test

    public void tesInsertQuotesTestTwoText_HappyPath(){

        String strOne = "Наполеон Бонапарт писал";

        String strTwo = "В моем словаре нет слова невозможно.";

        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";
        //act
        String actualResult = new InsertQuotes().insertQuotes(strOne,strTwo);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }

    /**9.Напишите метод, кторый принимает на вход название города и исправляет написание:
     Test Data:
     “ташкент” → “Ташкент”
     “ЧикаГО” → “Чикаго”*/

    @Test

    public void testInsertTownText_HappyPath(){

        String strOne = "ташкент";

        String strTwo = "В моем словаре нет слова невозможно.";

        String expectedResult = "Ташкент";
        //act
        String actualResult = new InsertQuotes().insertTown(strOne);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }





}

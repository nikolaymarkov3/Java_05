import org.testng.Assert;
import org.testng.annotations.Test;

public class SplitTest {


    /**14.Напишите метод, который принимает на вход предложение и возвращает слова
     *  из этого предложения в виде массива слов
     Test Data:
     “QA for Everyone” → {“QA”, “for”, “Everyone”}
     “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}*/

    @Test

    public void testSplitTest_HappyPath() {

        String strOne = "QA for Everyone";



        String expectedResult = "[QA, for, Everyone]";
        //act
        String actualResult = new Split().split(strOne);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testSplitTestAlecs_HappyPath() {

        String strOne = "Александр Сергеевич Пушкин";



        String expectedResult = "[Александр, Сергеевич, Пушкин]";
        //act
        String actualResult = new Split().split(strOne);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**15.Написать метод, который принимает на вход предложение, которое состоит из имени,
     *  фамилии, отчества и возвращает текст:
     Test Data:
     “Александр Сергеевич Пушкин” →

     “Имя: Александр
     Отчество: Сергеевич
     Фамилия: Пушкин”*/


    @Test

    public void testSplitTestAlecName_HappyPath() {

        String strOne = "Александр Сергеевич Пушкин";



        String expectedResult = "Имя: Александр\n" +
                "Отчество: Сергеевич\n" +
                "Фамилия: Пушкин";
        //act
        String actualResult = new Split().splitName(strOne);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}

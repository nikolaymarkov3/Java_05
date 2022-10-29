import org.testng.Assert;
import org.testng.annotations.Test;

public class СountJavaTest {

    /**Напишите метод countJava(), который принимает на вход текст и проверяет,
     *  содержится ли в тексте хотя бы одно слово Java.
     Test Data:
     “As of March 2022, Java 18 is the latest version, while Java 17, 11
     and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost
     public update for the legacy version Java 8 LTS in January 2019 for commercial use, although
     it will otherwise still support Java 8 with public updates for personal use indefinitely.
     Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security
     and other upgrades.” → true

     “99 little bugs in a code.
     99 little bugs in a code.
     Take one down, and patch it around.
     235 critical bugs in the code.” → false*/


    @Test

    public void tesCountJavaTestAs_HappyPath(){

        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11\n" +
                "     and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost\n" +
                "     public update for the legacy version Java 8 LTS in January 2019 for commercial use, although\n" +
                "     it will otherwise still support Java 8 with public updates for personal use indefinitely.\n" +
                "     Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security\n" +
                "     and other upgrades.";

        String expectedResult = "true";
        //act
        String actualResult = new CountJava().countJava(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }



    @Test

    public void tesCountJavaTest99_HappyPath(){

        String str = "99 little bugs in a code.\n" +
                "     99 little bugs in a code.\n" +
                "     Take one down, and patch it around.\n" +
                "     235 critical bugs in the code.";

        String expectedResult = "false";
        //act
        String actualResult = new CountJava().countJava(str);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);


    }


}

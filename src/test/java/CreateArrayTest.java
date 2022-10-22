import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;

public class CreateArrayTest {

    /**
     * 1.1	В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
     * который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    @Test
    public void testCreateIntArray(){

        int a = 1;
        int s = 2;
        int d = 3;
        int f = 4;
        int g = 5;

        //AAA
        //arrange
        int[] expectedResult = new int[]{a, s, d, f, g};

        //act

        int[] actualResult = new CreateArray().createIntArray(a,s,d,f,g);

        //Assert

        Assert.assertEquals(expectedResult,actualResult);


    }



    /**1.2.	Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
     *  и возвращает массив из этих же чисел
     Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */

    @Test
    public void testCreateDoubleArray(){

        double a = 1.1;
        double s = 2.5;
        double d = 3.7;
        double f = 4.0;
        double g = 5.5;

        double[] expectedResult = new double[]{a, s, d, f, g};

        double[] actualResult = new CreateArray().createDoubleArray(a, s, d, f, g);


        Assert.assertEquals(expectedResult,actualResult);
    }


    /**1.3.	Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    @Test
     public void testCreateStringArray() {
        String a = "It";
        String s = "was";
        String d = "an";
        String f = "apple";
        String g = "pie";

        String[] expectedResult = {a, s, d, f, g};


        String[] actualResult = new CreateArray().createStringArray(a, s, d, f, g);

        Assert.assertEquals(expectedResult, actualResult);

    }

//    public double

    /**1.4.	Написать метод createArrayFromText(), который принимает на вход предложение из
     * нескольких слов и возвращает массив из этих слов.
     Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */


    @Test

    public void testCreateArrayFromText(){

        String text = "It was an apple pie";

        String[] expectedResult = {"It", "was", "an", "apple", "pie"};


        String[] actualResult = new CreateArray().createArrayFromText(text);

        Assert.assertEquals(expectedResult,actualResult);
    }

}

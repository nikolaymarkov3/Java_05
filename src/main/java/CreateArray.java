import static java.lang.String.valueOf;

public class CreateArray {

    /**
     * 1.1	В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
     * который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    public int[] createIntArray(int a, int s, int d, int f, int g){

        int[] sum = new int[]{a,s,d,f,g};
        return sum;
    }

    /**
     * 1.2.	Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
     * и возвращает массив из этих же чисел
     * Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */

    public double[] createDoubleArray(double a, double s, double d, double f, double g) {

        double[] sum = new double[]{a,s,d,f,g};
        return sum;
    }

    /**1.3.	Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public String[] createStringArray(String a, String s, String d, String f, String g) {

       String[] sum = new String[]{a,s,d,f,g};
        return sum;

    }


    /**1.4.	Написать метод createArrayFromText(), который принимает на вход предложение из
     * нескольких слов и возвращает массив из этих слов.
     Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public String[] createArrayFromText(String text){

        String[] sum = text.split(" ");

        return sum;
    }



}

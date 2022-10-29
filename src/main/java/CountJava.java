public class CountJava {

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

    public String countJava(String text) {
        if (!text.isEmpty()){

            boolean str = text.contains("Java");

            return "" + str;
        }

        return "Пустая строка";
    }
}

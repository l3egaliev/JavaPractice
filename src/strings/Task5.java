package strings;

/**
 * Замена подстроки в строке
 */

public class Task5 {

    public static String changeSubstring(String text, String substring, String stringToChange){
        return text.replace(substring, stringToChange);
    }

    public static void main(String[] args) {
        String text = "It's my phone";
        String sub = "my";
        String replacement = "your";
        System.out.println(changeSubstring(text, sub, replacement));

    }
}

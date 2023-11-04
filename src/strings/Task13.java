package strings;

/**
 * Поиск и замена всех вхождений подстроки
 */

public class Task13 {
    public static String replaceSubstrings(String text, String substring, String replace){
        return text.replace(substring, replace);
    }

    public static void main(String[] args) {
        String text = "Search and replace all substrings and print";
        System.out.println(replaceSubstrings(text, "and", "or"));

    }
}

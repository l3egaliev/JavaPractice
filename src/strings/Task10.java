package strings;

/**
 * Подсчет количества вхождений подстроки в строку
 */

public class Task10 {
    public static int countSubstringOccurrences(String text, String substring){
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
            System.out.println(index);
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "this is the text from the sub";
        System.out.println(countSubstringOccurrences(text, "the"));

    }
}

package strings;

/**
 * Поиск подстроки в строке
 */

public class IsSubstring {
    public static void main(String[] args) {
        String str = "Java is the greatest programming language";
        String subStr = "greatest";
        System.out.println(isSubString(str, subStr));
    }

    public static boolean isSubString(String text, String sub){
        return text.contains(sub);
    }

}

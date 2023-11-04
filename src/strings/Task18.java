package strings;

/**
 * ѕроверка на палиндром без учета регистра
 */

public class Task18 {
    public static boolean checkPalindromeIgnoreCase(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String st = "A man, a plan, a canal, Panama";
        System.out.println(checkPalindromeIgnoreCase(st));
    }

}

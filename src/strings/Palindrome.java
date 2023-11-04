package strings;

/**
 * Проверка на палиндром
 */

public class Palindrome {

    public static boolean checkToPalindrome(String text){
        boolean res = false;
        String reverse = new StringBuilder(text).reverse().toString();
        int n = reverse.compareTo(text);
        if(n == 0){
            res = true;
        }

        return res;
    }

    public static void main(String[] args) {
        String text = "шалаш шалаш";
        System.out.println(checkToPalindrome(text));
    }
//public static boolean isPalindrome(String str) {
//    str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//    String reversed = new StringBuilder(str).reverse().toString();
//    System.out.println(str);
//    return str.equals(reversed);
//}
//
//    public static void main(String[] args) {
//        String input = "A man, a plan, a canal, Panama";
//        boolean isPalindrome = isPalindrome(input);
//        System.out.println("Is palindrome: " + isPalindrome);
//    }

}


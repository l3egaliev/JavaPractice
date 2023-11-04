package strings;

/**
 *  Замена символов в строке
 */

public class ReplaceChars {
    public static String replaceCharacters(String mainText, Character olderChar, Character newChar){
        return mainText.replace(olderChar, newChar);
    }

    public static void main(String [] args){
        String main = "Jaca";
        System.out.println(replaceCharacters(main, 'c', 'v'));
    }

}

package strings;

import java.util.Arrays;

/**
 * Разделение строки на слова
 */

public class Task6 {

    public static void main(String[] args) {
        String text = "I hate the lazy people!";
        for(String s: split(text)){
            System.out.println(s);
        }
    }

    public static String [] split(String text){
        return text.split(" ");
    }
}


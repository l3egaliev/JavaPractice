package strings;

/**
 * Подсчитать заданную букву в строке
 */

public class Task20 {
    static int countLetter(String text, char letter){
        String [] arr = text.split(" ");
        int counter = 0;

        for (String s : arr){
            char [] arrLetters = s.toCharArray();
            for (char c : arrLetters){
                if(c == letter){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String text = "test";
        System.out.println(countLetter(text, 't'));
    }
}

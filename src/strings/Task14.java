package strings;

/**
 * Обратный порядок слов в строке
 */
public class Task14 {
    public static String reverse_words_in_string(String text){
        StringBuilder builder = new StringBuilder();
        String [] arr = text.split(" ");

        // Переворачиваем массив
        int length = arr.length;
        String [] tempArr = new String[length];

        for (int i = 0; i < tempArr.length; i++){
            tempArr[i] = arr[length - 1 - i]; // length = 4 - 1 - 0 // length = 4 - 1 - 1 // length = 4 - 1 - 2 etc.
        }
        System.arraycopy(tempArr, 0, arr, 0, length);
        ///////////////

        for(String s : arr){
            builder.append(s).append(" ");
        }

        return builder.toString();
    }

    // Method 2
    public static String reverseWordsInString2(String txt){
        StringBuilder builder = new StringBuilder();
        String [] arrayString = txt.split(" ");
        for(int i = arrayString.length - 1; i >= 0; i--){
            builder.append(arrayString[i]).append(" ");
        }
        return builder.toString();

    }


    public static void main(String[] args) {
        String text = "This a just test";
        System.out.println(reverse_words_in_string(text));
        System.out.println(reverseWordsInString2(text));

    }
}

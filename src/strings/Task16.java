package strings;

/**
 * Поиск наиболее часто встречающегося символа
 */

public class Task16 {

    public static char findMostFrequentChar(String text) {
        int[] charCount = new int[256]; // Assuming ASCII characters
        for (char c : text.toCharArray()) {
            charCount[c]++;
        }
        char mostFrequent = ' ';
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                mostFrequent = (char) i;
                maxCount = charCount[i];
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String text = "ff ff rrrrrr";
        char mostFrequent = findMostFrequentChar(text);
        System.out.println("Most frequent character: " + mostFrequent);
    }
}

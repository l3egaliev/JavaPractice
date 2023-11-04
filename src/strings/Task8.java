package strings;

/**
 * Обрезка строки до указанной длины
 */

public class Task8 {
    public static void main(String[] args) {
        String text = "Я учу программирование очень хорошо";
        System.out.println(crop(22, text));
    }

    public static String crop(int endIndex, String text){
        return text.substring(0, endIndex);
    }
}

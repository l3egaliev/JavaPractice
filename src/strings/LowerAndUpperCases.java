package strings;

/**
 * ѕреобразование строки в верхний и нижний регистр
 */
public class LowerAndUpperCases {
    public static String toUpperCase(String text){
        return text.toUpperCase();
    }
    public static String toLowerCase(String text){
        return text.toLowerCase();
    }

    public static void main(String[] args) {
        String text = "Transformation text";
        System.out.println(toLowerCase(text));
        System.out.println(toUpperCase(text));

    }
}

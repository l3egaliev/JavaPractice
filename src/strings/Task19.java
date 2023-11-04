package strings;

/**
 * Сравнение двух строк без учета регистра
 */

public class Task19 {

    public static void main(String[] args) {
        String st1 = "Hello Java";
        String st2 = "hello java1";

        System.out.println(st1.equalsIgnoreCase(st2));
    }
}

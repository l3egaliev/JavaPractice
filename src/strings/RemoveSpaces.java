package strings;

/**
 * Удаление лишних пробелов
 */
public class RemoveSpaces {
    public static String removeExtraSpaces(String text){
        String res = text.replaceAll("\\s+", " ").trim();  // метод trim() удаляет пробелы в начале и в конце строки
        return res;
    }

    public static void main(String[] args) {
        String text = " Этот   текст    с   лишними   пробелами   ";
        System.out.println(text);
        System.out.println("После удаления лишних пробелов: "+removeExtraSpaces(text));
    }

}

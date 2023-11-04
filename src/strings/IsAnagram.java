package strings;

/**
 *  Проверка на анаграмму
 *
 *  Анаграмма - это слово или фраза, образованные путем перестановки букв другого слова или фразы,
 *  обычно используя все исходные буквы ровно один раз. Например,
 *  лето - тело, куст - стук
 */

public class IsAnagram {
    public static void main(String[] args) {
        String s1 = "тело";
        String s2 = "лето";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2){
        // Убираем пробелы
        String str1 = s1.replaceAll("[\\s]", "");
        String str2 = s2.replaceAll("[\\s]", "");
        return (str1.length() == str2.length() &&
                str1.chars().sum() == str2.chars().sum());
    }

}

package strings;

/**
 * ������� ������ �� ��������� �����
 */

public class TruncateString {
    public static void main(String[] args) {
        String text = "� ��� ���������������� ����� ������";
        System.out.println(crop(22, text));
    }

    public static String crop(int endIndex, String text){
        return text.substring(0, endIndex);
    }
}

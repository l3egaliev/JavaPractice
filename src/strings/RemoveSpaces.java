package strings;

/**
 * �������� ������ ��������
 */
public class RemoveSpaces {
    public static String removeExtraSpaces(String text){
        String res = text.replaceAll("\\s+", " ").trim();  // ����� trim() ������� ������� � ������ � � ����� ������
        return res;
    }

    public static void main(String[] args) {
        String text = " ����   �����    �   �������   ���������   ";
        System.out.println(text);
        System.out.println("����� �������� ������ ��������: "+removeExtraSpaces(text));
    }

}

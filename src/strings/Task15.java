package strings;

import java.util.Arrays;
import java.util.Locale;

/**
 * ������� ���������� ������� � ��������� ����
 */

public class Task15 {
    public static void countVowelsAndConsonants(String text){
        int vowels = 0;
        int consonants = 0;
        text = text.toLowerCase();

        for(Character c : text.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o'){
                    consonants++;
                }else {
                    vowels++;
                }
            }
        }

        System.out.println("���������� �������: "+vowels);
        System.out.println("���������� ���������: "+consonants);

    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Read the text");
    }
}

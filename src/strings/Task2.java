package strings;

import java.util.Scanner;

/**
 * ������� ���������� ���� � ������
 */

public class Task2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ �����������: ");
        String [] input = scanner.nextLine().split(" ");
        StringBuilder res = new StringBuilder();
        for(String s: input){
            res.append(s).append(" ");
         }
        System.out.println("� �����������: '"+res+"' "+input.length+" ����");

    }

}

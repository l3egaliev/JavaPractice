package strings;

import java.util.Scanner;

/**
 * Подсчет количества слов в строке
 */

public class Task2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пишите предложение: ");
        String [] input = scanner.nextLine().split(" ");
        StringBuilder res = new StringBuilder();
        for(String s: input){
            res.append(s).append(" ");
         }
        System.out.println("В предложении: '"+res+"' "+input.length+" слов");

    }

}

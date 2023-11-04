package strings;

import java.util.Scanner;

/**
 * Реверс строки: Напишите программу, которая переворачивает введенную пользователем строку.
 */

public class Task1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Слово для переворачивания: ");
        String str = scanner.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("После переворачивания:");
        System.out.println(reversedStr);

    }
}

package games;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
   static Scanner scanner = new Scanner(System.in);
   static String [][] board = {{"1","|", "2", "|", "3"},
                               {"-", "+", "-", "+", "-"},
                               {"4","|", "5", "|", "6"},
                               {"-", "+", "-", "+", "-"},
                               {"7","|", "8", "|", "9"}};


    public static void main(String[] args) {
        start();
    }


    public static void printBoard(String [][] board){
        for(String [] rows: board){
            for (String columns : rows){
                System.out.print(columns+" ");
            }
            System.out.println();
        }
    }

//    public static void info(String [][] board){
//        System.out.println("Свободные места:");
//        System.out.println(freeCoordinates(board));
//    }
//
//    public static String freeCoordinates(String [][] board){
//        StringBuilder free = new StringBuilder();
//
//        for(int r = 0; r<board.length; r++){
//            for(int c = 0; c<board[r].length; c++) {
//                if (Objects.equals(board[r][c], " "))
//                    free.append(r).append(",").append(c).append(" \t");
//                else{
//                    free.append(" ");
//                }
//            }
//        }
//
//        return free.toString();
//    }




    public static void start(){
        System.out.println();
        String x = "x";
        String is0 = "0";
        boolean gameOver = isFree(board);
        while (gameOver){

            System.out.println();
            System.out.println("Ход игрока Х");
            printBoard(board);

            String p1 = scanner.nextLine();
            int n = Integer.parseInt(p1);
            incorrectNum(n);
            select(board, p1, x);

            if(isDraw(board)) {
                System.out.println("Ничья");
                gameOver = false;
            }else if(winner(board)){
                System.out.println("Победитель X");
                gameOver = false;
            }

            System.out.println();
            System.out.println("Ход игрока 0");
            printBoard(board);

            String p2 = scanner.nextLine();
            int n2 = Integer.parseInt(p2);
            incorrectNum(n2);
            select(board, p2, is0);

            if(isDraw(board)) {
                System.out.println("Ничья");
                gameOver = false;
            }else if(winner(board)){
                System.out.println("Победитель 0");
                gameOver = false;
            }
        }
        printBoard(board);
    }


    public static boolean isFree(String [][] board){
        for (String[] rows : board) {
            for (String cols : rows) {
                if (!cols.equalsIgnoreCase("x") || (!cols.equals("0")))
                    return true;
            }
        }
        return false;
    }

    public static boolean winner(String [][] board){
        boolean x = (board[0][0].equals("X") && board[0][2].equals("X") && board[0][4].equals("X")) || (board[2][0].equals("X") &&
                board[2][2].equals("X") && board[2][4].equals("X") || board[4][0].equals("X") && board[4][2].equals("X")
        && board[4][4].equals("X") || board[0][0].equals("X") && board[2][0].equals("X") && board[4][0].equals("X") ||
                board[0][2].equals("X") && board[2][2].equals("X") && board[4][2].equals("X") || board[0][4].equals("X")
        && board[2][4].equals("X") && board[4][4].equals("X") || board[0][0].equals("X") && board[2][2].equals("X") &&
                board[4][4].equals("X") || board[0][4].equals("X") && board[2][2].equals("X") && board[4][0].equals("X"));

        boolean o = (board[0][0].equals("0") && board[0][2].equals("0") && board[0][4].equals("0")) || (board[2][0].equals("0") &&
                board[2][2].equals("0") && board[2][4].equals("0") || board[4][0].equals("0") && board[4][2].equals("0")
                && board[4][4].equals("0") || board[0][0].equals("0") && board[2][0].equals("0") && board[4][0].equals("0") ||
                board[0][2].equals("0") && board[2][2].equals("0") && board[4][2].equals("0") || board[0][4].equals("0")
                && board[2][4].equals("0") && board[4][4].equals("0") || board[0][0].equals("0") && board[2][2].equals("0") &&
                board[4][4].equals("0") || board[0][4].equals("0") && board[2][2].equals("0") && board[4][0].equals("0"));

            return x || o;

    }

    public static boolean isDraw(String[][] board) {
        // Проверяем, что на игровом поле больше нет свободных позиций.
        boolean isFull = true;
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (!board[i][k].equals("X") && !board[i][k].equals("0")) {
                    isFull = false;
                    break;
                }
            }
        }

        // Проверяем, что нет победителя.
        boolean noWinner = !winner(board);

        // Если игровое поле заполнено, и никто не выиграл, то это ничья.
        return isFull && noWinner;
    }




    public static void select(String [][] board, String num, String player){

            if (player.equalsIgnoreCase("x")) {
                switch (num) {
                    case "1" -> board[0][0] = "X";
                    case "2" -> board[0][2] = "X";
                    case "3" -> board[0][4] = "X";
                    case "4" -> board[2][0] = "X";
                    case "5" -> board[2][2] = "X";
                    case "6" -> board[2][4] = "X";
                    case "7" -> board[4][0] = "X";
                    case "8" -> board[4][2] = "X";
                    case "9" -> board[4][4] = "X";
                }

            }else if(player.equalsIgnoreCase("0")){
                switch (num) {
                    case "1" -> board[0][0] = "0";
                    case "2" -> board[0][2] = "0";
                    case "3" -> board[0][4] = "0";
                    case "4" -> board[2][0] = "0";
                    case "5" -> board[2][2] = "0";
                    case "6" -> board[2][4] = "0";
                    case "7" -> board[4][0] = "0";
                    case "8" -> board[4][2] = "0";
                    case "9" -> board[4][4] = "0";
                }
        }
    }

//    public static int check0(String [][] board){
//        int res = 1;
//        for(String [] rows : board){
//            for(String cols : rows){
//                if (cols.equals("0"))
//                    res = -1;
//            }
//        }
//        return res;
//    }


    public static boolean checkX0(String [][] board){
        boolean res = false;
        for(String [] rows : board){
            for(String cols : rows){
                if (cols.equals("X") || cols.equals("0")){
                    res = true;
                }
            }
        }
        return res;
    }


    public static void incorrectNum(int n){
        if(n > 9 || n < 0){
            System.out.println("Неверное число");
        }
    }

}

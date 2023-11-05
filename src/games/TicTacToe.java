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
        System.out.println();
        System.out.println("Формат ввода - координаты x,y");
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

    public static int isFree(String [][] board){
        int r = 0;
        for(int i = 0; i<board.length; i++){
            for(int k = 0; k<board[i].length; k++){
                if(!(board[i][k].equalsIgnoreCase("x") || board[i][k].equalsIgnoreCase("0")))
                    r++;
            }
        }
        return r;
    }


    public static void start(){
        System.out.println();
        String x = "x";
        String is0 = "0";
        while (isFree(board) > 0){


                System.out.println();
                System.out.println("Ход игрока Х");
                printBoard(board);

                String p1 = scanner.nextLine();
                select(board, p1, x);



                System.out.println();
                System.out.println("Ход игрока 0");
                printBoard(board);

                String p2 = scanner.nextLine();
                select(board, p2, is0);


            }
        winner(board);
    }


    public static void winner(String [][] board){
        boolean x = (board[0][0] == "X" && board[0][2] == "X" && board[0][4] == "X");
        if(x){
            System.out.println("Победитель X");
        }
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


}

package com.bridgelabz;

public class TicTacToe {
    static char[] board = new char[10]; // board size 10
    public static void main(String[] args) {
        createBoard();//calling method
        System.out.printf("Welcome to Tic Tac Toe Game");
    }
    /*Method use:
     *in method data is character
     *and using for loop to iteration from 1 to 9

     */
    public static void createBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
    }
}

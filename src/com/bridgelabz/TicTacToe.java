package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    public static char playerSymbol;
    public static char cpSymbol;
    static char[] board = new char[10]; // board size 10
    public static void main(String[] args) {
        createBoard();//calling method
        System.out.println("Select the Letter you wanted \n  Press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
        Scanner scan =new Scanner(System.in); //Create scanner object
        int choice = scan.nextInt();

        TicTacToe.allowPlayer(choice);
        scan.close();
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
    public  static void allowPlayer( int choice){
        switch(choice){
            case 1 : {
                playerSymbol='X';
                cpSymbol='O';
                break;
            }
            case 2 :{
                playerSymbol='O';
                cpSymbol='X';
                break;
            }
            default: {
                System.out.println("Invalid Choice . Retry Again!");
                return;
            }
        }
    }
}

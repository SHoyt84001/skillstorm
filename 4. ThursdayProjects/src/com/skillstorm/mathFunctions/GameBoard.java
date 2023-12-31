package com.skillstorm.mathFunctions;

public class GameBoard {
    public static void main(String[] args) {
        // Define the size of the game board
        int rows = 10;
        int cols = 10;

        // Declare a 2D array to represent the game board
        char[][] board = new char[rows][cols];

        // Initialize the game board, for example, with empty spaces
        initializeGameBoard(board);

        // You can now access and modify individual elements of the game board
        // For example, set the value at row 2, column 3 to 'X'
        board[2][4] = 'X';

        // Print the game board
        printGameBoard(board);
    }

    // Method to initialize the game board with empty spaces
    private static void initializeGameBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // Use any character to represent an empty space, for example, '.'
                board[i][j] = '.';
            }
        }
    }

    // Method to print the game board
    private static void printGameBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

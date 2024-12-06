package org.lumijiez.medium;

import java.util.HashSet;

public class M36 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkColumns(board) && checkSquares(board);
    }

    public static boolean checkSquares(char[][] board) {
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                if (!checkBox(board, boxRow * 3, boxCol * 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkBox(char[][] board, int startRow, int startCol) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char num = board[startRow + i][startCol + j];
                if (num != '.') {
                    if (!addToSetAndCheckIfValid(set, Character.getNumericValue(num))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkRows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!addToSetAndCheckIfValid(set, Character.getNumericValue(num))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkColumns(char[][] board) {
        for (int j = 0; j < 9; j++) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!addToSetAndCheckIfValid(set, Character.getNumericValue(num))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean addToSetAndCheckIfValid(HashSet<Integer> set, int num) {
        if (set.contains(num)) {
            return false;
        }
        set.add(num);
        return true;
    }
}

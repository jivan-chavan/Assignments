package com.tictactoe.main;

import java.util.Scanner;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);
    static char[][] array = new char[3][3];
    static boolean gameWon = false;

    public static void main(String args[]) {
        int c = 0;
        while (!gameWon) {
            char sign = (c % 2 != 0) ? 'O' : 'X';
            System.out.println("Player " + (c % 2 + 1));
            allocate(sign);
            display();
            game();
            c++;
        }
    }

    public static void allocate(char sign) {
        int a;
        do {
            System.out.println("Enter positon Number for move:");
            a = sc.nextInt();
        } while (a < 1 || a > 9 || checker((a - 1) / 3, (a - 1) % 3, sign) == 1);

        int r = (a - 1) / 3;
        int c = (a - 1) % 3;
        array[r][c] = sign;
    }

    public static int checker(int r, int c, char sign) {
        return (array[r][c] == 'O' || array[r][c] == 'X') ? 1 : 0;
    }

    public static void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void game() {
        for (int i = 0; i < 3; i++) {
            if ((array[i][0] == 'X' && array[i][1] == 'X' && array[i][2] == 'X')
                    || (array[0][i] == 'X' && array[1][i] == 'X' && array[2][i] == 'X')) {
                System.out.println("Player 1 Wins");
                gameWon = true;
                return;
            } else if ((array[i][0] == 'O' && array[i][1] == 'O' && array[i][2] == 'O')
                    || (array[0][i] == 'O' && array[1][i] == 'O' && array[2][i] == 'O')) {
                System.out.println("Player 2 Wins");
                gameWon = true;
                return;
            }
        }

        if ((array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X')
                || (array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X')) {
            System.out.println("Player 1 Wins");
            gameWon = true;
            return;
        } else if ((array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O')
                || (array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O')) {
            System.out.println("Player 2 Wins");
            gameWon = true;
            return;
        }

        boolean isDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] != 'X' && array[i][j] != 'O') {
                    isDraw = false;
                    break;
                }
            }
            if (!isDraw) {
                break;
            }
        }
        if (isDraw) {
            System.out.println("It's a Draw");
        }
    }
}

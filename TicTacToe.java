package Tutorial8;

import java.util.Scanner;

public class TicTacToe {
    static String[] tiles = {"1","2","3","4","5","6","7","8","9"};

    public static void main(String[] args) {
        printBoard();
        acceptInput();
    }

    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 7; i = i + 3) {
            System.out.println("-------------");
            System.out.println("| " + tiles[i] + " | " + tiles[i+1] + " | " + tiles[i+2] + " | ");
        }
        System.out.println("-------------");
    }

    static int flagSetter(String line) {
        int flag = 0;
        if (line.equals("XXX")) {
            flag = 1;
        } else if (line.equals("OOO")) {
            flag = 2;
        }
        return flag;
    }

    static int declareWinner() {
        String line;
        int result = 0;
        for (int i = 0; i < 7; i = i + 3) {
            line = tiles[i] + tiles[i + 1] + tiles[i + 2];
            if (flagSetter(line) != 0){
                result = flagSetter(line);
                break;
            }
        }
        if (result == 0) {
            for (int i = 0; i < 3; i++) {
                line = tiles[i] + tiles[i + 3] + tiles[i + 6];
                if (flagSetter(line) != 0){
                    result = flagSetter(line);
                    break;
                }
            }
            if (result == 0) {
                line = tiles[0] + tiles[4] + tiles[8];
                result = flagSetter(line);
                if (result == 0) {
                    line = tiles[2] + tiles[4] + tiles[6];
                    result = flagSetter(line);
                }
            }
        }
        return result;
    }

    static void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i < 9; i++) {
            System.out.println("\nPLAYER 0" + count);
            System.out.print("\nEnter Tile Number[1-9]: ");
            String tile = scanner.nextLine();
            if (count == 1) {
                tiles[Integer.parseInt(tile) - 1] = "X";
            } else if (count == 2) {
                tiles[Integer.parseInt(tile) - 1] = "O";
                count = 0;
            }
            count++;
            printBoard();
            if (declareWinner() == 1) {
                System.out.println("\nPlayer 01 Wins!");
                break;
            } else if (declareWinner() == 2) {
                System.out.println("\nPlayer 02 Wins!");
                break;
            } else if (i == 8) {
                System.out.println("\nDraw!");
            }
        }
    }
}
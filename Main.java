package tictactoe;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[9];
        for (int i = 0; i < 9; i++) {
            a[i] = " ";
        }
        System.out.println("---------");
        for (int i = 1; i <= 9; i++) {
            if (i % 3 == 1) {
                System.out.print("|" + " " + a[i - 1] + " ");
            } else if (i % 3 == 2) {
                System.out.print(a[i - 1] + " ");
            } else {
                System.out.println(a[i - 1] + " |");
            }
        }
        System.out.println("---------");

        boolean xWin = false;
        boolean oWin = false;
        String result;
        if (Objects.equals(a[0], "O") && Objects.equals(a[1], "O") && Objects.equals(a[2], "O")) {
            oWin = true;
        } else if (Objects.equals(a[3], "O") && Objects.equals(a[4], "O") && Objects.equals(a[5], "O")) {
            oWin = true;
        } else if (Objects.equals(a[6], "O") && Objects.equals(a[7], "O") && Objects.equals(a[8], "O")) {
            oWin = true;
        } else if (Objects.equals(a[0], "O") && Objects.equals(a[3], "O") && Objects.equals(a[6], "O")) {
            oWin = true;
        } else if (Objects.equals(a[1], "O") && Objects.equals(a[4], "O") && Objects.equals(a[7], "O")) {
            oWin = true;
        } else if (Objects.equals(a[2], "O") && Objects.equals(a[5], "O") && Objects.equals(a[8], "O")) {
            oWin = true;
        } else if (Objects.equals(a[0], "O") && Objects.equals(a[4], "O") && Objects.equals(a[8], "O")) {
            oWin = true;
        } else if (Objects.equals(a[2], "O") && Objects.equals(a[4], "O") && Objects.equals(a[6], "O")) {
            oWin = true;
        }
        if (Objects.equals(a[0], "X") && Objects.equals(a[1], "X") && Objects.equals(a[2], "X")) {
            xWin = true;
        } else if (Objects.equals(a[3], "X") && Objects.equals(a[4], "X") && Objects.equals(a[5], "X")) {
            xWin = true;
        } else if (Objects.equals(a[6], "X") && Objects.equals(a[7], "X") && Objects.equals(a[8], "X")) {
            xWin = true;
        } else if (Objects.equals(a[0], "X") && Objects.equals(a[3], "X") && Objects.equals(a[6], "X")) {
            xWin = true;
        } else if (Objects.equals(a[1], "X") && Objects.equals(a[4], "X") && Objects.equals(a[7], "X")) {
            xWin = true;
        } else if (Objects.equals(a[2], "X") && Objects.equals(a[5], "X") && Objects.equals(a[8], "X")) {
            xWin = true;
        } else if (Objects.equals(a[0], "X") && Objects.equals(a[4], "X") && Objects.equals(a[8], "X")) {
            xWin = true;
        } else if (Objects.equals(a[2], "X") && Objects.equals(a[4], "X") && Objects.equals(a[6], "X")) {
            xWin = true;
        }
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < 9; i++) {
            if (Objects.equals(a[i], "X")) {
                counterX++;
            }
            if (Objects.equals(a[i], "O")) {
                counterO++;
            }
        }
        if (xWin) {
            result = "X wins";
        } else if (oWin) {
            result = "O wins";
        } else if (counterO + counterX == 9) {
            result = "Draw";
        } else {
            result = "Game not finished";
        }
        int coordinate1 = 0;
        int coordinate2 = 0;
        boolean xMove = false;
        while (result.equals("Game not finished")) {
            boolean reScan = true;
            while (reScan) {
                if (!(scanner.hasNextInt())) {
                    System.out.println("You should enter numbers!");
                    coordinate1 = scanner.nextInt();
                    coordinate2 = scanner.nextInt();
                    if (coordinate1 < 1 || coordinate1 > 3 || coordinate2 < 1 || coordinate2 > 3) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        continue;
                    }
                    if (Objects.equals(a[3 * (coordinate1 - 1) + (coordinate2 - 1)], "X")
                            || Objects.equals(a[3 * (coordinate1 - 1) + (coordinate2 - 1)], "O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                    reScan = false;
                } else {
                    coordinate1 = scanner.nextInt();
                    coordinate2 = scanner.nextInt();
                    if (coordinate1 < 1 || coordinate1 > 3 || coordinate2 < 1 || coordinate2 > 3) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        continue;
                    }
                    if (Objects.equals(a[3 * (coordinate1 - 1) + (coordinate2 - 1)], "X")
                            || Objects.equals(a[3 * (coordinate1 - 1) + (coordinate2 - 1)], "O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                    reScan = false;
                }
            }
            if (!xMove) {
                a[3 * (coordinate1 - 1) + (coordinate2 - 1)] = String.valueOf('X');
                xMove = true;
            } else {
                a[3 * (coordinate1 - 1) + (coordinate2 - 1)] = String.valueOf('O');
                xMove = false;
            }
            System.out.println("---------");
            for (int i = 1; i <= 9; i++) {
                if (i % 3 == 1) {
                    System.out.print("|" + " " + a[i - 1] + " ");
                } else if (i % 3 == 2) {
                    System.out.print(a[i - 1] + " ");
                } else {
                    System.out.println(a[i - 1] + " |");
                }
            }
            System.out.println("---------");
            if (Objects.equals(a[0], "O") && Objects.equals(a[1], "O") && Objects.equals(a[2], "O")) {
                oWin = true;
            } else if (Objects.equals(a[3], "O") && Objects.equals(a[4], "O") && Objects.equals(a[5], "O")) {
                oWin = true;
            } else if (Objects.equals(a[6], "O") && Objects.equals(a[7], "O") && Objects.equals(a[8], "O")) {
                oWin = true;
            } else if (Objects.equals(a[0], "O") && Objects.equals(a[3], "O") && Objects.equals(a[6], "O")) {
                oWin = true;
            } else if (Objects.equals(a[1], "O") && Objects.equals(a[4], "O") && Objects.equals(a[7], "O")) {
                oWin = true;
            } else if (Objects.equals(a[2], "O") && Objects.equals(a[5], "O") && Objects.equals(a[8], "O")) {
                oWin = true;
            } else if (Objects.equals(a[0], "O") && Objects.equals(a[4], "O") && Objects.equals(a[8], "O")) {
                oWin = true;
            } else if (Objects.equals(a[2], "O") && Objects.equals(a[4], "O") && Objects.equals(a[6], "O")) {
                oWin = true;
            }
            if (Objects.equals(a[0], "X") && Objects.equals(a[1], "X") && Objects.equals(a[2], "X")) {
                xWin = true;
            } else if (Objects.equals(a[3], "X") && Objects.equals(a[4], "X") && Objects.equals(a[5], "X")) {
                xWin = true;
            } else if (Objects.equals(a[6], "X") && Objects.equals(a[7], "X") && Objects.equals(a[8], "X")) {
                xWin = true;
            } else if (Objects.equals(a[0], "X") && Objects.equals(a[3], "X") && Objects.equals(a[6], "X")) {
                xWin = true;
            } else if (Objects.equals(a[1], "X") && Objects.equals(a[4], "X") && Objects.equals(a[7], "X")) {
                xWin = true;
            } else if (Objects.equals(a[2], "X") && Objects.equals(a[5], "X") && Objects.equals(a[8], "X")) {
                xWin = true;
            } else if (Objects.equals(a[0], "X") && Objects.equals(a[4], "X") && Objects.equals(a[8], "X")) {
                xWin = true;
            } else if (Objects.equals(a[2], "X") && Objects.equals(a[4], "X") && Objects.equals(a[6], "X")) {
                xWin = true;
            }
            int counterXNew = 0;
            int counterONew = 0;
            for (int i = 0; i < 9; i++) {
                if (Objects.equals(a[i], "X")) {
                    counterXNew++;
                }
                if (Objects.equals(a[i], "O")) {
                    counterONew++;
                }
            }
            if (xWin) {
                result = "X wins";
            } else if (oWin) {
                result = "O wins";
            } else if (counterONew + counterXNew == 9) {
                result = "Draw";
            } else {
                result = "Game not finished";
            }
        }
        switch (result) {
            case "X wins":
                System.out.println("X wins");
                break;
            case "O wins":
                System.out.println("O wins");
                break;
            case "Draw":
                System.out.println("Draw");
                break;
        }
    }
}


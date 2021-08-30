package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class contains methods to solving tasks with multidimensional arrays
 * */

public class MultiDArraysTasks {

    public static void increaseElements() {
        Scanner sc = new Scanner(System.in);
        int increment;
        int[][][] array = new int[3][3][3];

        System.out.print("Created 3D-array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{ ");
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                    System.out.printf("%d ", array[i][j][k]);
                }
                System.out.print("}");
            }
            System.out.print("   ");
        }
        System.out.print("\nEnter the number by which to increase each element of the array: ");
        increment = sc.nextInt();
        System.out.print("Resulted array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{ ");
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] += increment;
                    System.out.printf("%d ", array[i][j][k]);
                }
                System.out.print("}");
            }
            System.out.print("   ");
        }
        System.out.println();
    }

    public static void chessBoard() {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i % 2 == 0) {
                    board[i][j] = (j % 2 == 0) ? "W" : "B";
                } else {
                    board[i][j] = (j % 2 == 0) ? "B" : "W";
                }
                System.out.printf("%s ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void matrixMultiplication() {
        int[][] matrixA = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrixB = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] matrixC = new int[3][3];

        System.out.println("Multiplication result: ");
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                for (int k = 0; k < matrixA[i].length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfElements() {
        int[][] array = arrayInitialization(3, 3);
        int sum = 0;
        for (int[] columns : array) {
            for (int cell : columns) {
                sum += cell;
            }
        }
        System.out.println("\nThe sum of the array elements: " + sum);
    }

    public static void arrayDiagonals() {
        int[][] array = arrayInitialization(3, 3);
        System.out.print("Array diagonals: { ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                    break;
                }
            }
        }
        System.out.print("}, { ");
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == (array.length - 1 - j)) {
                    System.out.print(array[i][j] + " ");
                    break;
                }
            }
        }
        System.out.println("}");
    }

    public static void arraySort() {
        int[][] array = arrayInitialization(3, 3);
        System.out.print("Sorted array:  {");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ ");
            Arrays.sort(array[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.print("}");
        }
        System.out.println("}");
    }

    private static int[][] arrayInitialization(int rows, int columns) {
        int[][] array = new int[rows][columns];
        System.out.print("Created array: {");
        for (int i = 0; i < rows; i++) {
            System.out.print("{ ");
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.printf("%d ", array[i][j]);
            }
            System.out.print("}");
        }
        System.out.println("}");
        return array;
    }
}

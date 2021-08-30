package cycle;

import java.util.Scanner;

/**
 * This class contains methods to solving tasks with cycles
 * */

public class Cycles {
    public static void getOdd() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void getFromFiveToOne() {
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void getSumFromTo() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter an integer positive number: ");
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.printf("Сумма всех чисел от 1 до %d равна: %d \n", limit, sum);
    }

    public static void getSequence() {
        int i = 0;
        while (i < 98) {
            System.out.print((i += 7) + " ");
        }
        System.out.println();
    }

    public static void getSequence2() {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.print((n -= 5) + " ");
        }
        System.out.println();
    }

    public static void getSquareOfNumber() {
        for (int i = 10; i <= 20; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}

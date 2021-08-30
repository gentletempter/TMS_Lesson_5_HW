package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTasks {
    public static void findNumberInArray() {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] array = arrayInitialization(10);
        Arrays.sort(array);
        System.out.print("Enter the number you want to find: ");
        num = new Scanner(System.in).nextInt();
        if (Arrays.binarySearch(array, num) >= 0) {
            System.out.println("--> Number " + num + " is in the array");
        } else {
            System.out.println("--> Number " + num + " is not in the array");
        }
    }

    public static void deleteNumberFromArray() {
        int length = 10;
        Scanner sc = new Scanner(System.in);
        int[] array = arrayInitialization(10);
        System.out.print("Enter the number you want to remove: ");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (array[i] == num) length--;
        }
        if (length == 10) {
            System.out.println("--> Number " + num + " is not in the array");
            return;
        }

        System.out.print("--> New array: ");
        int[] newArray = new int[length];
        for (int i = 0, j = 0; i < 10; i++) {
            if (array[i] != num) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void getMinMaxAvgInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = arrayInitialization(length);
        int sum = 0;
        float avg;

        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        avg = (float) sum / length;
        Arrays.sort(array);
        System.out.printf("Min value: %d; max value: %d; average value: %.2f \n", array[0], array[length - 1], avg);
    }

    public static void getAvgInTwoArrays() {
        int sum = 0;
        float avgArray1;
        float avgArray2;
        int[] array1 = arrayInitialization(5);
        int[] array2 = arrayInitialization(5);

        for (int i = 0; i < 5; i++) {
            sum += array1[i];
        }
        avgArray1 = (float) sum / 5;

        sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += array2[i];
        }
        avgArray2 = (float) sum / 5;

        if (avgArray1 > avgArray2) {
            System.out.println("The average of the first array is larger");
        } else if (avgArray1 < avgArray2) {
            System.out.println("The average of the second array is larger");
        } else {
            System.out.println("The averages of the arrays are equal");
        }
    }

    public static void makeArrays() {
        Scanner sc = new Scanner(System.in);
        int length;
        int evenCount = 0;
        System.out.print("Enter the length of the array: ");
        while (true) {
            length = sc.nextInt();
            if (length > 5 && length <= 10) {
                break;
            } else {
                System.out.println("Invalid value. Value must be > 5 and <= 10");
            }
        }
        int[] array = arrayInitialization(length);
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        int[] newArray = new int[evenCount];
        System.out.print("--> New array: ");
        for (int i = 0, j = 0; i < length; i++) {
            if (array[i] % 2 == 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void editArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = arrayInitialization(length);
        for (int i = 1; i < length; i += 2) {
            array[i] = 0;
        }
        System.out.println("Edited array:  " + Arrays.toString(array));
    }

    public static void sortNames() {
        String[] names = new String[]{"Tony", "Max", "David", "Kate", "Jack"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

    public static void bubbleSort() {
        int length = 10;
        int[] array = arrayInitialization(length);
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
        System.out.println("Sorted array:  " + Arrays.toString(array));
    }

    private static int[] arrayInitialization(int length) {
        int[] array = new int[length];
        System.out.print("Created array: ");
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
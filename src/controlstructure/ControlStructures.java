package controlstructure;

/**
 * This class contains methods to solving tasks with control structures
 * */

public class ControlStructures {
    public static void getMonthName(int i) {
        switch (i) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid number of month!");
        }
    }

    public static void getTimeOfYear(int i) {
        if (i == 1 || i == 2 || i == 12) {
            System.out.println("Winter");
        } else if (i >= 3 && i <= 5) {
            System.out.println("Spring");
        } else if (i >= 6 && i <= 8) {
            System.out.println("Summer");
        } else if (i >= 9 && i <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid number of month");
        }
    }

    public static void checkEvenOrOdd(int i) {
        if (i % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void checkTemperature(int t) {
        if (t > -5) {
            System.out.println("Warm");
        } else if (t > -20 ) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    public static void getRainbowColor(int i) {
        switch (i) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("Invalid value");
        }
    }
}
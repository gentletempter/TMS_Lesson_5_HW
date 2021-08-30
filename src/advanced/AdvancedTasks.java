package advanced;

public class AdvancedTasks {
    public static void getFibonacci() {
        for (int i = 0; i < 11; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void getDeposit(float sum, int i) {
        System.out.println(deposit(sum, i));
        System.out.println(depositRecursive(sum, i));
    }

    public static void getMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }

    private static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

    private static float depositRecursive(float sum, int i) {
        if (i == 1) {
            return sum * 1.07f;
        }
        return deposit(sum, i - 1) * 1.07f;
    }

    private static float deposit(float sum, int n) {
        for (int i = 1; i <= n; i++) {
            sum *= 1.07f;
        }
        return sum;
    }
}
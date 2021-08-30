import advanced.AdvancedTasks;
import array.ArraysTasks;
import array.MultiDArraysTasks;
import controlstructure.ControlStructures;
import cycle.Cycles;

/**
 * Designed to test each of methods in packages.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Control structures---------");
        System.out.println(">>>>>>>>>>>>>>Task_0<<<<<<<<<<<<<<<<<");
        ControlStructures.getMonthName(3);
        System.out.println(">>>>>>>>>>>>>>Task_1<<<<<<<<<<<<<<<<<");
        ControlStructures.getTimeOfYear(8);
        System.out.println(">>>>>>>>>>>>>>Task_2<<<<<<<<<<<<<<<<<");
        ControlStructures.checkEvenOrOdd(-3);
        System.out.println(">>>>>>>>>>>>>>Task_3<<<<<<<<<<<<<<<<<");
        ControlStructures.checkTemperature(-6);
        System.out.println(">>>>>>>>>>>>>>Task_4<<<<<<<<<<<<<<<<<");
        ControlStructures.getRainbowColor(5);
        System.out.println("---------cycle.Cycles---------");
        System.out.println(">>>>>>>>>>>>>>Task_0<<<<<<<<<<<<<<<<<");
        Cycles.getOdd();
        System.out.println(">>>>>>>>>>>>>>Task_1<<<<<<<<<<<<<<<<<");
        Cycles.getFromFiveToOne();
        System.out.println(">>>>>>>>>>>>>>Task_2<<<<<<<<<<<<<<<<<");
        Cycles.getSumFromTo();
        System.out.println(">>>>>>>>>>>>>>Task_3<<<<<<<<<<<<<<<<<");
        Cycles.getSequence();
        System.out.println(">>>>>>>>>>>>>>Task_4<<<<<<<<<<<<<<<<<");
        Cycles.getSequence2();
        System.out.println(">>>>>>>>>>>>>>Task_5<<<<<<<<<<<<<<<<<");
        Cycles.getSquareOfNumber();
        System.out.println("---------Advanced tasks---------");
        System.out.println(">>>>>>>>>>>>>>Task_0<<<<<<<<<<<<<<<<<");
        AdvancedTasks.getFibonacci();
        System.out.println(">>>>>>>>>>>>>>Task_1<<<<<<<<<<<<<<<<<");
        AdvancedTasks.getDeposit(100.0f, 3);
        System.out.println(">>>>>>>>>>>>>>Task_2<<<<<<<<<<<<<<<<<");
        AdvancedTasks.getMultiplicationTable();
        System.out.println("---------Arrays---------");
        System.out.println(">>>>>>>>>>>>>>Task_0<<<<<<<<<<<<<<<<<");
        ArraysTasks.findNumberInArray();
        System.out.println(">>>>>>>>>>>>>>Task_1<<<<<<<<<<<<<<<<<");
        ArraysTasks.deleteNumberFromArray();
        System.out.println(">>>>>>>>>>>>>>Task_2<<<<<<<<<<<<<<<<<");
        ArraysTasks.getMinMaxAvgInArray();
        System.out.println(">>>>>>>>>>>>>>Task_3<<<<<<<<<<<<<<<<<");
        ArraysTasks.getAvgInTwoArrays();
        System.out.println(">>>>>>>>>>>>>>Task_4<<<<<<<<<<<<<<<<<");
        ArraysTasks.makeArrays();
        System.out.println(">>>>>>>>>>>>>>Task_5<<<<<<<<<<<<<<<<<");
        ArraysTasks.editArray();
        System.out.println(">>>>>>>>>>>>>>Task_6<<<<<<<<<<<<<<<<<");
        ArraysTasks.sortNames();
        System.out.println(">>>>>>>>>>>>>>Task_7<<<<<<<<<<<<<<<<<");
        ArraysTasks.bubbleSort();
        System.out.println("---------Multidimensional arrays---------");
        System.out.println(">>>>>>>>>>>>>>Task_0<<<<<<<<<<<<<<<<<");
        MultiDArraysTasks.increaseElements();
        System.out.println(">>>>>>>>>>>>>>Task_1<<<<<<<<<<<<<<<<<");
        MultiDArraysTasks.chessBoard();
        System.out.println(">>>>>>>>>>>>>>Task_2<<<<<<<<<<<<<<<<<");
        MultiDArraysTasks.matrixMultiplication();
        System.out.println(">>>>>>>>>>>>>>Task_3<<<<<<<<<<<<<<<<<");
        MultiDArraysTasks.sumOfElements();
        System.out.println(">>>>>>>>>>>>>>Task_4<<<<<<<<<<<<<<<<<");
        MultiDArraysTasks.arrayDiagonals();
        System.out.println(">>>>>>>>>>>>>>Task_5<<<<<<<<<<<<<<<<<");
        MultiDArraysTasks.arraySort();
    }
}

package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.printf("number count in the array ");
        int number = scanner.nextInt();
        int[] array = getArray(3);
        printArray(array);
        sortInteger(array);

    }

    private static int[] getArray(int number) {
        System.out.println("Enter " + number + " numbers :-");

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("the numbers are \r" + array[i]);
        }
    }

    public static void sortInteger(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag) {//sorting very important
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }

        }
        printArray(array);
        printArray(sortedArray);
    }

}

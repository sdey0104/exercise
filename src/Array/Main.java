package Array;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        int[] myVariable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,};
        //myVariable[3] = 40;

        double[] myDoubleArray = new double[25];
        System.out.println(myVariable[0]);
        System.out.println(myVariable[7]);
        System.out.println(myVariable[9]);


//        int [] newArray = new int[25];
//        for (int i = 0 ; i<newArray.length ; i++){
//            newArray[i]=i*10;
//        }
        int[] newArray = new int[10];
        newArray = getInterger(10);
        printArray(newArray);
        System.out.println("The Average is "+ getAverage(newArray));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getInterger(int number) {
        System.out.println("Enter " + number + "integer values :");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }


}

package ReverseArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a value");
            array[i] = scanner.nextInt();
        }

        reverse(array);

    }

    public static void reverse(int[] array) {

        int [] arrayToBeReversed = array;
        int maxIndex = arrayToBeReversed.length-1;
        int halfIndex = maxIndex/2;
        int temp ;
        for(int i = 0 ; i<=halfIndex;i++){
            temp = arrayToBeReversed[i];
            arrayToBeReversed[i] = arrayToBeReversed[maxIndex-i];
            arrayToBeReversed[maxIndex-i]=temp;
        }

        System.out.println(Arrays.toString(arrayToBeReversed));

    }
}

package MinimumElementChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        int[] array = readInteger();
        int minValue = findMin(array);
        System.out.println("Minimum value is : " + minValue);
    }

    public static int[] readInteger() {
        System.out.println("Enter the count : ");
        int count = scanner.nextInt();

        int[] value = new int[count];
        if (count > 0) {
            for (int i = 0; i < value.length; i++) {
                System.out.println("enter a value ");
                value[i] = scanner.nextInt();
            }
        }
        else
            System.out.println("no values are entered");
        return value;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE; // 4 , 1 ,3
        boolean flag = true;
        int[] navigateArray = array;
        //  while (flag) {
        //    flag = false;
        if (navigateArray.length > 1) {
            for (int i = 0; i < navigateArray.length; i++) {
// 1,2,0,1,2
                int value = navigateArray[i];
           //     for (int j = navigateArray.length - 1; j >= 0; j--) {
                    if (value<min) {
                        min = value;
                        //  flag = true;
                    }

              //  }

            }
        } else {
            min = navigateArray[0];
        }
        //  }
        return min;
    }
}

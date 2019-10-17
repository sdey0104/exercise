import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[][] sumArray = new int[4][4];

        int count = 1;
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                int sum = 0;
                sum += arr[row][col];
                sum += arr[row][col + 1];
                sum += arr[row][col + 2];
                sum += arr[row + 1][col + 1];
                sum += arr[row + 2][col];
                sum += arr[row + 2][col + 1];
                sum += arr[row + 2][col + 2];
                count++;
                sumArray[row][col] = sum;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (sumArray[row][col] > max) {
                    max = sumArray[row][col];
                }
            }
        }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];
        for (int row = 0; row < 6; row++)//Outer loop - Fills the rows
        {
            for (int col = 0; col < 6; col++)//Inner loop Fills the columns
            {
                System.out.println("enter a number for row "+row+" and column :"+col);
                arr[row][col] = scanner.nextInt();
            }
        }


//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }

        int result = hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        System.out.println(result);

        scanner.close();
    }
}

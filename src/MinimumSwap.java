import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwap {

    // Complete the minimumSwaps function below.
    public static int minimumSwaps(int[] arr) {

//        long result = 0;
//        long swap;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                swap = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = ((int) swap);
//                result++;
//                i--;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));

     //   return (int) result;
       int n = arr.length - 1;
       int minSwaps = 0;
       for (int i = 0; i < n; i++) {
           if (i < arr[i] - 1) {
               swap(arr, i, Math.min(n, arr[i] - 1));
               minSwaps++;
               i--;
           }
       }
       return minSwaps;


    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(res);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

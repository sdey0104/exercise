
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotationArray {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int len = a.length;
        int[] arr = new int[len];
//        int[] temp = new int[d];
//
//
//        for (int i = 0; i < d; i++) {
//            temp[i] = a[i];
//        }
//
//        int count = len - d;
//
//        for (int j = 0; j < count; j++) {
//           arr[j]=a[len-count+j];
//        }




        System.arraycopy(a, d, arr, 0, len - d);
        System.arraycopy(a, 0, arr, len - d, d); //arrayCopy


        System.out.println(Arrays.toString(arr));

        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        scanner.close();
    }
}

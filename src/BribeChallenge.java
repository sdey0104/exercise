//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class  {

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BribeChallenge {

    // Complete the minimumBribes function below.
//    static void minimumBribes(int[] q) {
//        int len = q.length;
//        int cnt = 0;
//        for (int i = len - 1; i >= 0; i--) {
//
//            if (q[i] != i - 1) {
//                if (((i - 1) >= 0) && q[i - 1] == (i + 1)) {
//                    cnt++;
//                    int temp=0;
//                    temp= q[i];
//                    q[i]=q[i-1];
//                    q[i-1]=temp;
//
//                } else if (((i - 2) >= 0) && q[i - 2] == (i + 1)) {
//
//                    cnt+=2;
//                    q[i-2]=q[i-1];
//                    q[i-1]=q[i];
//                    q[i]=i-1;
//
//                }
//            } else {
//                System.out.println("too chaotic");
//
//
//            }
//
//        }
//        //System.out.println(cnt);
//
//
//    }
//
    static int minimumBribes(int[] q) {

        //////

        int result = 0;
        boolean swapped = false;

        do
        {
            swapped = false;

            for(int i = 1; i < q.length; i++)
            {
                if(q[i - 1] - i > 2)
                    return -1;

                if(q[i - 1] > q[i])
                {
                    //swap elements
                    int cache = q[i];
                    q[i] = q[i - 1];
                    q[i - 1] = cache;

                    swapped = true;
                    result++;
                }
            }
        }
        while(swapped);

        System.out.println("ggg");








return -1;




        /////////

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XofAKindInADeckOfCard {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {

        String[] arr = scanner.nextLine().split(" ");

        int len = arr.length;
        int intArr[] = new int[len];
        for (int i = 0; i < len; i++) {
            intArr[i] = (Integer.parseInt(arr[i]));
        }

        boolean x = hasGroupsSizeX(intArr);
        if(x) {
            System.out.println("Yes");
        }

    }

    public static boolean hasGroupsSizeX(int[] deck) {

        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck)
            count[c]++;

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);
        System.out.println(values);

        lovelu: for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v: values)
                    if (v % X != 0)
                        continue lovelu;
                return true;
            }

        return false;
    }


    }




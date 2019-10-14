public class greatestCommonDivisor {
    public static void main(String[] arg) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int i = 1;
        int j = 1;
        int divisor1;
        int divisor2;
        int GCD = 0;
        do {
            divisor1 = first % i;
            divisor2 = second % j;
            if (divisor1 == 0 && divisor2 == 0) {
                GCD = i;
            }
            i++;
            j++;
        } while (i <= first && j <= second);
        return GCD;
    }
}

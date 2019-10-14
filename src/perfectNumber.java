public class perfectNumber {

    public static void main(String[] arg) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int i = 1;
        do {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        } while (i < number);

        if (sum == number) {
            return true;
        }
        return false;
    }


}

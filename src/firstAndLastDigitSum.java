public class firstAndLastDigitSum {

    public static void main(String[] arg) {
        System.out.println(sumFirstAndLastDigit(100));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        if (number < 10) {
            return number + number;
        }
        do {
            if (number >= 10) {
                firstDigit = number / 10;
                number = firstDigit;
            }
            else break;

        } while (number > 0);

        return lastDigit + firstDigit;
    }

}

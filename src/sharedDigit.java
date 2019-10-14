public class sharedDigit {
    public static void main(String[] arg) {
        System.out.println(hasSharedDigit(2,23));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99) {
            return false;
        }
        if (number2 < 10 || number2 > 99) {
            return false;
        }
        int lastn1 = number1 % 10;
        int firstn1 = number1 / 10;
        int lastn2 = number2 % 10;
        int firstn2 = number2 / 10;
        if (lastn1 == lastn2 || lastn1 == firstn1 || firstn1 == firstn2 || lastn1==firstn2) {
            return true;
        }
        return false;
    }
}

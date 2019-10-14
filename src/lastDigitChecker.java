public class lastDigitChecker {
    public static void main(String[] arg) {
        System.out.println(hasSameLastDigit(9,99,19));

    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x < 10 || y < 10 || z < 10) {
            return false;
        }
        if (x > 1000 || y > 1000 || z > 1000) {
            return false;
        }

        int lastx = x % 10;
        int lasty = y % 10;
        int lastz = z % 10;
        if (lastx == lasty || lasty == lastz || lastz == lastx) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number<10 || number>1000){
            return false;
        }
        return true;
    }
}

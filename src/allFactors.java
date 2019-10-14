public class allFactors {

    public static void main(String[] arg) {
        printFactors(10);
    }

    public static void printFactors(int number) {
        String print = "";
        if (number < 1) {
            System.out.println("Invalid Value");

        } else {
            int i = 1;
            int factor;
            do {
                if (number % i == 0) {
                    factor = i;
                    print = Integer.toString(factor);
                    System.out.println(print);
                }
                i++;
            } while (i <= number);
        }
    }
}

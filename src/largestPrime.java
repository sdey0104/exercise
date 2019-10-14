public class largestPrime {

    public static void main(String[] arg) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        int flag = 0;
        if (number <= 0) {
            return -1;
        }
        int largestPrime = 2;

        for (int j = 1; j <= number; j++) {
            if (number % j == 0) {
                int n = j;//it is the number to be checked
                int m = n / 2;
                if (n == 0 || n == 1) {
                  //  System.out.println(n + " is not prime number");
                } else {
                    for (int i = 2; i <= m; i++) {
                        if (n % i == 0) {
                           // System.out.println(n + " is not prime number");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        if (largestPrime <= n) {
                            largestPrime = n;
                        }
                    }//end of else
                }
            }

        }


        return largestPrime;
    }
}


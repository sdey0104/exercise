import java.util.Scanner;

public class readingUserInputChallange {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter list of values");
        int i = 1;
        int number = 0;
        for (; i < 11; i++) {
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int nextint = scanner.nextInt();
               number = number + nextint;
            } else {
                System.out.println();
                System.out.println("invalid value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum is " + number);
        scanner.close();
    }

    public static void nextInt() {



    }


}

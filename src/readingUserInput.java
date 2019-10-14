import java.util.Scanner;

public class readingUserInput {

    public static void main(String[] srg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your date of birth");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {

            int yob = scanner.nextInt();
            if (yob < 1) {
                System.out.println("bad value");
            } else {
                scanner.nextLine(); //handle next line character(enter key)
                System.out.println("Enter your name ");
                String name = scanner.nextLine();
                int age = 2019 - yob;

                System.out.println("your name is " + name + " and you are " + age + " years old");

            }
        }
        else{
            System.out.println("false yob");
        }
            scanner.close();
    }
}

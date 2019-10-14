import java.util.Scanner;

public class minMaxChallenge {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to check");
        int counter = scanner.nextInt();
         int i =1;
        int min = 0;
        int max = 0;
        boolean flag = true;
        scanner.nextLine();
        while (i < counter+ 1){
            System.out.println("Enter number "+i );
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                if(flag){
                    min = number;
                    max = number;
                    flag = false;
                }
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                } else {

                }
            }
            else{
                System.out.println("Invalid Value");
                break;
            }
            i++;
            scanner.nextLine();
        }
        System.out.println("Minimum Value is "+ min + " and Maximum value is "+ max);
        scanner.close();
    }



}

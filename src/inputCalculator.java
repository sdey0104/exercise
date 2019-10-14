import java.util.Scanner;

public class inputCalculator {

    public static void main(String[] arg){

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.MAX_VALUE;
        int i = 1;
        int number = 0;
        double average = 0.000;
        while(i<counter){
            boolean hasnextInt = scanner.hasNextInt();
            if(hasnextInt){
                number = number + scanner.nextInt();
            }
            else{
                if(i == 1){
                    System.out.println("SUM = " + number + " AVG = " + (int)average);
                    break;
                }
                else {
                    average = Math.round(((double) number) / (i - 1));
                    System.out.println("SUM = " + number + " AVG = " + (int)average);
                    break;
                }
            }
            scanner.nextLine();
            i++;
        }
        scanner.close();
    }

}

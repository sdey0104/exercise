package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("New Alipore");

    public static void main(String[] arg) {

        boolean quit = true;
        while (quit) {
            System.out.println("Select Banking option");
            int number = scanner.nextInt();
            switch (number) {
                case 0:
                    printBankingOption();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    printBankDetails();
                    break;
                case 3:
                    quit = false;
                    break;

            }
        }

    }

    public static void printBankingOption(){
        System.out.println("press 1 to add Branch with Customer Name" +
                "\n press 2 to retreive Bank details" +
                "\n press 3 to quit bank");

    }

    public static void addBranch(){
        bank.addNewBranch(bank.createBranch());
    }

    public static void printBankDetails(){
        bank.printBranchList();
    }

}

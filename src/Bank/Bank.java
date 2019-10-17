package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static ArrayList<Branch> branchArrayList = new ArrayList<>();
    private String branchame;
    private static Scanner scanner = new Scanner(System.in);
    private static Customer customer;
    private static Branch branch;
    //private static Bank bank;
    private static ArrayList<Customer> customerArrayList = new ArrayList<Customer>();


    public Bank(String branchame) {
        this.branchame = branchame;
    }

    public static void addNewBranch(Branch branch) {
        int lastPosition = branchArrayList.size();
        branchArrayList.set(lastPosition, branch);
    }

    public static Branch createBranch() {
        System.out.println("Create new Branch");
        System.out.println("Branch Name");
        String branchName = scanner.next();
        boolean quitCreateCustomer = false;
        while (!quitCreateCustomer) {
            System.out.println("Enter 1 to create customer and 2 to ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Enter Name");
                    String name = scanner.next();
                    System.out.println("Enter Amount");
                    double amount = scanner.nextDouble();
                    customer = new Customer(name, amount);
                    customerArrayList.add(customer);
                    break;

                case 2:
                    if(customerArrayList.size()<=0) {
                        customerArrayList.add(0, Customer.createCustomer("blank", 0.0));
                    }
                    quitCreateCustomer = true;
                    break;
            }
        }

        branch = new Branch(branchName, customerArrayList);
        return branch;

    }

    public void printBranchList() {
        int count = branchArrayList.size();
        for (int i = 0; i < count; i++) {
            System.out.println(branchArrayList.get(i).getBranchName() + "Customers --->" + branchArrayList.get(i).getCustomerArrayList());
        }

    }


}

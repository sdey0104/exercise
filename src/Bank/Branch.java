package Bank;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerArrayList = new ArrayList<>();


    public Branch(String branchName, ArrayList<Customer> customerArrayList) {
        this.branchName = branchName;
        this.customerArrayList = customerArrayList;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public static Branch branchName(String branchName, ArrayList<Customer> customerArrayList){
        return new Branch(branchName,customerArrayList);
    }
}

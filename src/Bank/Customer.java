package Bank;

public class Customer {

    private String name;
    private double amount;

    public Customer(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public static Customer createCustomer(String name, double amount){
        return new Customer(name,amount);
    }
}

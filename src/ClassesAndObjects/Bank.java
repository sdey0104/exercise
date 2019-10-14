package ClassesAndObjects;

public class Bank {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    public int phoneNumber;

    public Bank(){
        this("NLD88383",737373,"SD","s@dey.com",8383838);//if constructor is empy we can call contructor from another constructor.
        System.out.println("Empty Constructor called");
    }

    public Bank(String number, double balance,String customerName,String email,int phoneNumber){
//        setAccountNumber(number);
//        setBalance(balance);
//        setCustomerName(customerName);
//        setEmail(email);
//        setPhoneNumber(phoneNumber);
//
        this.accountNumber=number;
        this.balance=balance;
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;
        this .email=email;

    }

    public Bank(String accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double deposit){
        setBalance(getBalance() + deposit);
        System.out.printf("\n The current balance is " + getBalance());
    }

    public void withdrawFund(double withdraw){
        if(withdraw>getBalance()){
            System.out.println("\n Insufficient Balance");
        }

        else {
            setBalance(getBalance()-withdraw);
            System.out.println("\nAmount withdrawn is " + withdraw);
            System.out.println("\n Balance : "+ getBalance());
        }

    }


}

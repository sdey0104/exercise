package ClassesAndObjects;

public class VipCustomer {

    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Sourav Default","20000","dey@deys.group");
        System.out.println("");
    }

    public VipCustomer(String name , String creditLimit){
        this (name,creditLimit,"yeds@get.group");
    }

    public VipCustomer(String name , String creditLimit , String emailAddress){
        this.creditLimit=creditLimit;
        this.name=name;
        this.emailAddress=emailAddress;
    }


    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

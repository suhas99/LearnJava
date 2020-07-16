public class Account {
    private String Number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //constructors
    //constructors are perfect examples for overloading. we can set default values or it can be invoked by another
    public  Account(){
        this("1234 5678 9012",100,"Default Name","default.email@gmail.com","1234567890");
        System.out.println("default constructor called");
    }


    //parametrized constructors
    public Account(String number,double balance , String customerName,String customerEmail,String customerPhoneNumber){
        this.Number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.customerPhoneNumber=customerPhoneNumber;
    }

    //with default values
    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("1234 5678 9012",100,customerName,customerEmail,customerPhoneNumber);

    }

    //methods
    public void depositAmount(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("The deposit  of "+depositAmount+" is done. The available balance is "+this.balance);
    }
    public void withdrawAmount(double withdrawAmount){
        if(this.balance-withdrawAmount<0){
            System.out.println("Not sufficient funds. The available is "+this.balance);
        }
        else{
            this.balance-=withdrawAmount;
            System.out.println("The withdrawl of "+withdrawAmount+" is done. The available balance is "+this.balance);
        }
    }

    //use command+N to automatically generate getters and  setters in intellij
    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

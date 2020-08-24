public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson() {
        this("defaultName",5000000,"defaultEmail@gmail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name,creditLimit,"suhas@gmail.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args){
        VipPerson person1=new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2=new VipPerson("suhas",10000000);
        System.out.println(person2.getName());

        VipPerson person3=new VipPerson("suhaskashyap",10000000,"suhaskashyap2@gmail.com");
        System.out.println(person3.getName());

    }
}

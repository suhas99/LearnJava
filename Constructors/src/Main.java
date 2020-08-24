public class Main {
public static void main(String[] args){
    Account suhasKashyapAccount= new Account();
    suhasKashyapAccount.withdrawAmount(1000);
    suhasKashyapAccount.depositAmount(2000);
    suhasKashyapAccount.withdrawAmount(3000);
    suhasKashyapAccount.withdrawAmount(1000);

    Account suhasAccount= new Account("1234 5678 9012",100,"Suhas Kashyap","abc@gmail.com","1234567890");
    System.out.println(suhasAccount.getCustomerPhoneNumber());
    suhasAccount.withdrawAmount(1000);
    suhasAccount.depositAmount(2000);
    suhasAccount.withdrawAmount(3000);
    suhasAccount.withdrawAmount(1000);

    Account kashyapAccount=new Account("Suhas Kashyap","abc@gmail.com","1234567890");
    System.out.println(kashyapAccount.getCustomerPhoneNumber()+"  "+kashyapAccount.getBalance());

}
}

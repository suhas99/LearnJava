public class Main {
    public static void main(String[] args) {
        ITelephone officePhone;
        officePhone= new LandLine("08174-000-000",true);
        officePhone.answerNumber();
        officePhone.dialNumber("1234567890");


        ITelephone personalPhone;
        personalPhone= new MobilePhone("08174-000-000",true);
        personalPhone.answerNumber();
        personalPhone.dialNumber("1234567890");
    }

}

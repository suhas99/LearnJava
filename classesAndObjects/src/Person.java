public class Person {
   private String firstName;
   private String lastName;
   private int age;

   //all getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
       return lastName;
    }

    public int getAge() {
        return age;
    }

    //all setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //setters based on condition
    public void setAge(int age) {
        if(age<0 || age >100) {
            this.age = 0;
        }
        else{
            this.age=age;
        }
    }

    //methods
    public boolean isTeen(){
        return age > 12 & age < 20;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty() ){
            return "";
        }
        else if(lastName.isEmpty()){
            return firstName;
        }
        else if(firstName.isEmpty()){
            return lastName;
        }
        else {
            return firstName+lastName;
        }
    }


public static void main(String[] args) {

    Person person = new Person();
    person.setFirstName("");
    person.setLastName("");
    person.setAge(10);
    System.out.println("Full name is " + person.getFullName());
    System.out.println("teen == " + person.isTeen());
    person.setFirstName("Suhas");
    person.setAge(18);
    System.out.println("Full name is " + person.getFullName());
    System.out.println("teen == " + person.isTeen());
    person.setLastName("Kashyap");
    System.out.println("Full name is " + person.getFullName());

}
}
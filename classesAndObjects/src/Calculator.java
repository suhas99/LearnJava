public class Calculator {
    public double firstNumber;
    public double secondNumber;

    //getters and setters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getFirstNumber(){
        return firstNumber;
    }
    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }

    //methods on two numbers
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisonResult(){
        return firstNumber/secondNumber;
    }

    public static void main(String[] args){
        Calculator cal =new Calculator();
        cal.setFirstNumber(20);
        cal.setSecondNumber(10);
        System.out.println(cal.getFirstNumber()+" "+cal.getSecondNumber());
        System.out.println("The Addition result is "+cal.getAdditionResult()+" The sub Result is "+cal.getSubtractionResult()+" The mul result is  "+cal.getMultiplicationResult()+" The div result is  "+cal.getDivisonResult());
    }
}

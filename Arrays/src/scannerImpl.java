import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class scannerImpl {
    //Scanner class object for input
    private static Scanner scanner = new Scanner(System.in);

    private static int[] getInteger(int length) {
        System.out.println("enter int values");
        int[] values = new int[length];

        //Reading each next int value
        for(int count=0; count<length; count++ ){
            values[count]=scanner.nextInt();

        }
        return values;
    }

    public static void main(String[] args) {
        int[] myArray = getInteger(5);

        for(int count=0; count<myArray.length; count++ ){
            System.out.println(myArray[count]);
        }




    }
}

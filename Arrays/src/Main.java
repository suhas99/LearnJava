import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //declaration and initialization
        int[] myArray =new int[10];
        myArray[5]=50;
        System.out.println(myArray[5]);

        double[] myArrayNew= {1,2,3,4,5,6};
        System.out.println(myArrayNew[5]);

        int[] forArrayIntialize =new int[10];

        for (int count=1; count<myArray.length; count++){
             forArrayIntialize[count]=count*2;
        }
        System.out.println(forArrayIntialize[5]);
        for (int count=1;count<myArray.length; count++){
            System.out.println(forArrayIntialize[count]);
        }

        //copy an array
        int[] copyArray = Arrays.copyOf(forArrayIntialize,10);

        //Refrences exmaples . Refrence point to same address in same memory
        int[] arraycopy = new int[10];
        int [] arrayRefrence= arraycopy;

        System.out.println(Arrays.toString(arraycopy));
        System.out.println(Arrays.toString(arrayRefrence));

        arrayRefrence[0]=1;

        System.out.println(Arrays.toString(arraycopy));
        System.out.println(Arrays.toString(arrayRefrence));


        //Resizing the array with hard copy
        System.out.println(arraycopy.length);

        int[] original=arraycopy;
        arraycopy =new int[12];
        System.out.println(arraycopy.length);
        System.out.println(Arrays.toString(arraycopy));


        for (int count=1;count<original.length; count++){
            arraycopy[count]=original[count];
        }
        System.out.println(original.length);


    }
    // method to print
    public static void printArray(int[] array){
        for (int count=1;count<array.length; count++){
            System.out.println(array[count]);
        }
    }
}

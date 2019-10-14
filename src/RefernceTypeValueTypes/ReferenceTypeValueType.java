package RefernceTypeValueTypes;

import java.util.Arrays;

public class ReferenceTypeValueType {
/*
Array is a reference type
both variables pointing to the same array in memory
if reference and checges in any of the variable it will change for the array its referenced to
 */

    public static void main(String[] arg) {
        int mYint = 10;
        int anothermYint = mYint;

        System.out.println("myInt : " + mYint);
        System.out.println("anotherInt : " + anothermYint);

        anothermYint++;

        System.out.println("myInt : " + mYint);
        System.out.println("anotherInt : " + anothermYint);


        int[] intArray = new int[5];
        int[] anotherArray = intArray;


        System.out.println("\nintArray" + Arrays.toString(intArray));
        System.out.println("\nintArray" + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        anotherArray= new int[]{1, 2, 3, 4, 5};

        System.out.println("\nintArray" + Arrays.toString(intArray));
        System.out.println("\n another intArray" + Arrays.toString(anotherArray));

        modifyArray(intArray);

        System.out.println("\nintArray" + Arrays.toString(intArray));
        System.out.println("\n another intArray" + Arrays.toString(anotherArray));

    }


    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};


    }

}

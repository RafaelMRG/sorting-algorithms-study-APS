package utils;

public class ArrayPrinter {

    public static void printArray(int[] arr){
        int arrLen = arr.length;
        System.out.printf("[ %d", arr[0]);
        for (int i = 1; i < arrLen; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print(" ]");
    }
}

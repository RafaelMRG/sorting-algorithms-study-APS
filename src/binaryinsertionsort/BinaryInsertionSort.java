package binaryinsertionsort;

import java.util.Arrays;

public class BinaryInsertionSort {

    private int[] arr;
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public BinaryInsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int arrLen = getArr().length;
        for (int i = 1; i < arrLen; i++) {
            int elAtual = getArr()[i];
            int searchedIndex = Math.abs(Arrays.binarySearch(getArr(), 0, i, elAtual) + 1);
            System.arraycopy(
                    getArr(),
                    searchedIndex,
                    getArr(),
                    searchedIndex + 1,
                    i - searchedIndex);
            getArr()[searchedIndex] = elAtual;
        }
    }

}

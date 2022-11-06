package bubblesort;

import java.util.Objects;

public class BubbleSort {
    private int[] arr;
    private String mode;
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public BubbleSort(int[] arr, String mode) {
        this.arr = arr;
        this.mode = mode;
    }
    public void sort() {
        int arrLen = getArr().length;
        int[] arr = this.getArr();
        if (Objects.equals(mode, "ASC")) {
            for (int i = 0; i < arrLen - 1; i++) {
                for (int j = 0; j < arrLen - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int aux = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = aux;
                    }
                }
            }
            return;
        }
        if (Objects.equals(mode, "DESC")) {
            for (int i = 0; i < arrLen - 1; i++) {

                for (int j = 0; j < arrLen - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int aux = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = aux;
                    }
                }
            }
        }
    }

}

package heapsort;

public class HeapSort {
    private int[] arr;
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public HeapSort(int[] arr) {
        this.arr = arr;
    }
    public void sort(){
        int i;
        for ( i = (getArr().length/2) - 1; i >= 0; i--){
            heapify(getArr().length, i);
        }
        for ( i = getArr().length - 1; i > 0; i--){
            swap(0, i);
            heapify(i, 0);
        }
    }
    public void heapify(int n, int i){
        int[] v = getArr();

        int bigger = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && v[left] > v[bigger]){
            bigger = left;
        }

        if (right < n && v[right] > v[bigger]){
            bigger = right;
        }

        if (bigger != i){
            swap(i, bigger);
            heapify(n, bigger);
        }
    }
    private void swap(int pos1, int pos2){
        int aux = getArr()[pos1];
        getArr()[pos1] = getArr()[pos2];
        getArr()[pos2] = aux;
    }

}

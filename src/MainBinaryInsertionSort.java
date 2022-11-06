import binaryinsertionsort.BinaryInsertionSort;
import bubblesort.BubbleSort;
import heapsort.HeapSort;
import utils.ArrayPrinter;
import utils.FileReader;
import utils.GenerateTimestamps;
import utils.TimeMeasure;

public class MainBinaryInsertionSort {
    public static void main(String[] args) {
        System.out.println("100.000 números\n");
        GenerateTimestamps timestamps = new GenerateTimestamps();
        for (int i = 0; i < 30; i++) {
            BinaryInsertionSort bis = new BinaryInsertionSort(timestamps.getTimestampList());
            TimeMeasure.start();
            bis.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n1000 números ----");
        for (int i = 0; i < 30; i++) {
            BinaryInsertionSort bis = new BinaryInsertionSort(FileReader.readFile("1000ints.txt"));
            TimeMeasure.start();
            bis.sort();
            TimeMeasure.end();
            if(i == 29){
                ArrayPrinter.printArray(bis.getArr());
            }
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n5000 números ----");
        for (int i = 0; i < 30; i++) {
            BinaryInsertionSort bis = new BinaryInsertionSort(FileReader.readFile("5000_numbers.txt"));
            TimeMeasure.start();
            bis.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n10000 números ----");
        for (int i = 0; i < 30; i++) {
            BinaryInsertionSort bis = new BinaryInsertionSort(FileReader.readFile("10000_numbers.txt"));
            TimeMeasure.start();
            bis.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();
    }
}

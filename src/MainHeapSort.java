import bubblesort.BubbleSort;
import heapsort.HeapSort;
import utils.ArrayPrinter;
import utils.FileReader;
import utils.GenerateTimestamps;
import utils.TimeMeasure;

public class MainHeapSort {
    public static void main(String[] args) {

        System.out.println("100.000 números\n");
        GenerateTimestamps timestamps = new GenerateTimestamps();
        for (int i = 0; i < 30; i++) {
            HeapSort hs = new HeapSort(timestamps.getTimestampList());
            TimeMeasure.start();
            hs.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n1000 números ----\n");
        for (int i = 0; i < 30; i++) {
            HeapSort hs = new HeapSort(FileReader.readFile("1000ints.txt"));
            TimeMeasure.start();
            hs.sort();
            TimeMeasure.end();
            if(i == 29){
                ArrayPrinter.printArray(hs.getArr());
            }
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n5000 números ----");
        for (int i = 0; i < 30; i++) {
            HeapSort hs = new HeapSort(FileReader.readFile("5000_numbers.txt"));
            TimeMeasure.start();
            hs.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n10000 números ----");
        for (int i = 0; i < 30; i++) {
            HeapSort hs = new HeapSort(FileReader.readFile("10000_numbers.txt"));
            TimeMeasure.start();
            hs.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();
    }
}

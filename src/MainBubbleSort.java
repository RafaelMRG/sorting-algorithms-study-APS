import bubblesort.BubbleSort;
import heapsort.HeapSort;
import utils.ArrayPrinter;
import utils.FileReader;
import utils.GenerateTimestamps;
import utils.TimeMeasure;

import java.util.Arrays;

public class MainBubbleSort {
    public static void main(String[] args) {
        System.out.println("100.000 números\n");
        GenerateTimestamps timestamps = new GenerateTimestamps();
        int[] timestampsArray = timestamps.getTimestampList();
        for (int i = 0; i < 30; i++) {
            BubbleSort bs = new BubbleSort(Arrays.copyOf(timestampsArray, timestampsArray.length), "ASC");
            TimeMeasure.start();
            bs.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();

        System.out.println("1000 números ----\n");
        for (int i = 0; i < 30; i++) {
            BubbleSort bs = new BubbleSort(FileReader.readFile("1000ints.txt"), "ASC");
            TimeMeasure.start();
            bs.sort();
            TimeMeasure.end();
            if(i == 29){
                ArrayPrinter.printArray(bs.getArr());
            }
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n5000 números ----");
        for (int i = 0; i < 30; i++) {
            BubbleSort bs = new BubbleSort(FileReader.readFile("5000_numbers.txt"), "ASC");
            TimeMeasure.start();
            bs.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();

        System.out.println("\n10000 números ----");
        for (int i = 0; i < 30; i++) {
            BubbleSort bs = new BubbleSort(FileReader.readFile("10000_numbers.txt"), "ASC");
            TimeMeasure.start();
            bs.sort();
            TimeMeasure.end();
        }
        TimeMeasure.calculateAvg();
    }
}
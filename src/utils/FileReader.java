package utils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static int[] readFile(String fileName){
        List<Integer> numbers = new ArrayList<>();
        int[] array;
        try{
            String this_path = System.getProperty("user.dir") + "/src/data/";
            Scanner fileReader = new Scanner(new java.io.FileReader(this_path + fileName));
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                numbers.add(Integer.valueOf(line));
            }
            array = numbers.stream().mapToInt(i -> i).toArray();
            return array;
        }catch(FileNotFoundException e){
            System.out.println("Exceção: " + e);
        }
        return new int[0];
    }
}

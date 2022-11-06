package utils;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class GenerateTimestamps {
    List<Integer> timestampList = new ArrayList<>();

    public int[] getTimestampList() {
        return timestampList.stream().mapToInt(i->i).toArray();
    }

    public GenerateTimestamps() {
        for(int i = 0; i < 100000; i++){
            timestampList.add((int) createTimestamp());
        }
    }

    private long createTimestamp(){
        long offset = Timestamp.valueOf("2021-01-01 00:00:00").getTime();
        long end = Timestamp.valueOf("2022-01-01 00:00:00").getTime();
        long diff = end - offset + 1;
        Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
        return rand.getTime();
    }

}

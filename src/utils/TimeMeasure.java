package utils;

import java.util.ArrayList;
import java.util.List;

public class TimeMeasure {
    private static long init;
    private static double timePassed;

    private static List<Double> timeResults = new ArrayList<>();

    public static double getTimePassed() {
        return timePassed;
    }

    public static void start(){
        init = System.nanoTime();
    }
    public static void end(){
        timePassed = (System.nanoTime() - init) * 1e-9;
        timeResults.add(timePassed);
        System.out.printf("%.9f segundos\n", timePassed);
    }
    public static void calculateAvg(){
        double medianTotal = 0.0;
        Double medianVal = 0.0;
        int timeQtd = timeResults.size();

        for(Double timeResult : timeResults){
            medianVal += timeResult;
        }
        medianVal = (medianVal / timeQtd);
        for(Double timeResult : timeResults){
            medianTotal += Math.abs(timeResult - medianVal);
        }
        medianTotal /= timeQtd;

        System.out.printf("\nDesvio padrão médio é :%.9f segundos", medianTotal);
        System.out.printf("\nMédia é :%.9f segundos", medianVal);
        timeResults.clear();
    }
}

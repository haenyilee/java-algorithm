package me.haeni.string;

import java.util.Arrays;

/*
public class DailyTemperature {
    public int[] dailyTemperatures(int[] temparatures) {
        int[] result = null;
        return result;
    }
}
 */
public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        DailyTemperature dt = new DailyTemperature();
        int[] result = dt.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = null;
        for(int i = 0; i<temperatures.length; i++){
            int j = i+1;
            int output =0;
            if(temperatures[i]<temperatures[j]){
                result[i] = output++;
            }

        }
        return result;
    }
}

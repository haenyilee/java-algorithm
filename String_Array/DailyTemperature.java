package String_Array;

import java.util.Arrays;

/*
public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
    }
}
 */
public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperature = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperature dt = new DailyTemperature();
        int[] result = dt.dailyTemperatures(temperature);
        System.out.println(Arrays.toString(result));
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int[] result = new int[temperatures.length];
        int top = -1;
        for(int i = 0; i<temperatures.length; i++) {
            while (top > -1 && temperatures[i] > temperatures[top]) {
                int index = stack[top--];
                result[index] = i - index;
            }
            stack[++top] = i;
        }
        return result;
    }
}
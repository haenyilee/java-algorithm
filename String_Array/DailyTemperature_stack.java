package String_Array;

import java.util.Arrays;
import java.util.Stack;

/*
public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
    }
}
 */
public class DailyTemperature_stack {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        DailyTemperature_stack dt = new DailyTemperature_stack();
        int[] result = dt.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<temperatures.length; i++) {
            // stack의 가장 위에 있는 값이 i번째 온도보다 낮을 때
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                // stack에서 낮은 값을 빼고 stack에 담겨있던 i번호 저장
                int index = stack.pop();
                // result index번째에 결과 저장
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
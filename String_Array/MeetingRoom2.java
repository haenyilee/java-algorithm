package String_Array;
/*class Mr2Interval {
    int start;
    int end;

    Mr2Interval() {
        start = 0;
        end = 0;
    }

    Mr2Interval(int s, int e) {
        start = s;
        end = e;
    }
}
public class MeetingRoom2 {
    public int solve(Interval[] intervals) {

    }
}*/

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class MrInterval {
    int start;
    int end;

    MrInterval() {
        start = 0;
        end = 0;
    }
    MrInterval(int s, int e) {
        start = s;
        end = e;
    }
}
public class MeetingRoom2 {
    public static void main(String[] args) {
        MrInterval mi1 = new MrInterval(15, 20);
        MrInterval mi2 = new MrInterval(0, 30);
        MrInterval mi3 = new MrInterval(5, 10);

        MrInterval[] intervals = {mi1, mi2, mi3};
        MeetingRoom2 mr2 = new MeetingRoom2();
        int result = mr2.solve(intervals);
        System.out.println(result);
    }


    public int solve(MrInterval[] intervals) {
        // 회의가 없을 때
        if(intervals == null || intervals.length == 0) return 0;

        // 회의가 1개 이상일 때
        Arrays.sort(intervals, (a, b)->a.start - b.start); // 람다방식으로 오름차순
        Queue<MrInterval> minHeap = new PriorityQueue<>(intervals.length, (a,b)->a.start-b.start); // Priority Queue 객체 생성

        // 최대로 필요한 회의장 수
        int max = 0;

        for(int i =0 ; i<intervals.length; i++) {
            // 이전 회의(minHeap에 담겨있는것)의 끝시간이 i번째 회의의 시작시간보다 크거나 같을 때까지
            while (!minHeap.isEmpty() && minHeap.peek().end >= intervals[i].start) {
                minHeap.poll();
            }
            // 이전 회의(minHeap에 담겨있는것)의 끝시간이 minHeap에 담길 회의 start보다 작은 상황이면? or minHeap이 비어있을 때
            minHeap.offer(intervals[i]);
            max = Math.max(max, minHeap.size()); // 현재 minHeap의 크기를 max로 변경
        }
        return max;
    }


    void print(MrInterval[] intervals){
        for(int i=0; i<intervals.length; i++){
            System.out.println(intervals[i].start+","+intervals[i].end);
        }
    }
}

package me.haeni.string;

import java.util.Arrays;
import java.util.Comparator;

// 주어지는 조건
/*
class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end = 0;
    }
    Interval(int s,int e){
        this.start = s;
        this.end = e;
    }
}

public class MeetingRoom {
    public boolean solve(Interval[] intervals){

    }
}
 */
class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end = 0;
    }
    Interval(int s,int e){
        this.start = s;
        this.end = e;
    }
}

public class MeetingRooms {
    public static void main(String[] args) {
        MeetingRooms a = new MeetingRooms();

        Interval in1 = new Interval(7,10);
        Interval in2 = new Interval(2,4);

        Interval[] intervals = {in1, in2};
        System.out.println(a.solve(intervals));
    }
    public boolean solve(Interval[] intervals){
        // intervals가 null값일 때 처리하기
        if(intervals == null)
            return false;

        // intervals 출력해보기
        print(intervals);

        // intervals 오름차순으로 sorting하기
        Arrays.sort(intervals,Comp);

        // [start1, end1] , [start2, end2] 에서 end1와 start2 비교하기
        for(int i=0; i<intervals.length-1;  i++) {
            if(intervals[i].end>intervals[i+1].start)
                return false;
        }
        return true;
    }

    // Comp : 오름차순으로 정렬하기
    Comparator<Interval> Comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    };

    // interval 각각의 시작과 끝 출력하기
    public void print(Interval[] intervals) {
        for(int i=0; i<intervals.length;  i++) {
            Interval in = intervals[i];
            System.out.println(in.start+" "+in.end);
        }
    }
}
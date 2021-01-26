package String_Array;
/*
import java.util.List;

class MgInterval {
    int start;
    int end;

    MgInterval() {
        start = 0;
        end = 0;
    }
    MgInterval(int s, int e) {
        start = s;
        end = e;
    }
}
public class MergeInterval {
    public List<MgInterval> merge(List<MgInterval> intervals) {

    }
}*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MgInterval {
    int start;
    int end;

    MgInterval() {
        start = 0;
        end = 0;
    }
    MgInterval(int s, int e) {
        start = s;
        end = e;
    }
}
public class MergeInterval {
    public static void main(String[] args) {
        MgInterval mi1 = new MgInterval(7,10);
        MgInterval mi2 = new MgInterval(2,4);
        MgInterval mi3 = new MgInterval(4,9);
        MgInterval mi4 = new MgInterval(1,3);

        List<MgInterval> intervals = new ArrayList<>();
        intervals.add(mi1);
        intervals.add(mi2);
        intervals.add(mi3);
        intervals.add(mi4);

        MergeInterval mi = new MergeInterval();
        List<MgInterval> result = mi.merge(intervals);
        mi.print(result); // 결과 출력
    }
    public List<MgInterval> merge(List<MgInterval> intervals) {
        List<MgInterval> result = new ArrayList<MgInterval>();

        // empty 처리
        if(intervals.isEmpty()) return intervals;

        // intervals start 번호 오름차순 정렬하기
        Collections.sort(intervals,Comp);

        // merge 실행
        MgInterval before = intervals.get(0);
        for(int i=1; i<intervals.size(); i++){
            MgInterval current = intervals.get(i);
            if(before.end >= current.start) {
                before.end = Math.max(before.end,current.start);
            } else {
                result.add(before);
                before = current;
            }
        }
        // 마지막 값
        if(!result.contains(before)) {
            result.add(before);
        }
        return result;
    }
    Comparator Comp = new Comparator<MgInterval>() {
        public int compare(MgInterval o1, MgInterval o2){
            return o1.start - o2.start;
        }
    };

    // 출력 메소드
    void print(List<MgInterval> intervals) {
        for(int i =0; i<intervals.size(); i++){
            System.out.println(intervals.get(i).start+","+intervals.get(i).end);
        }
    }
}
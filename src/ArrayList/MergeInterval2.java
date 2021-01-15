package ArrayList;
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
}
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }
    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
public class MergeInterval2 {
    public static void main(String[] args) {
        MergeInterval2 mi = new MergeInterval2();

        Interval mi1 = new Interval(2,6);
        Interval mi2 = new Interval(8,10);
        Interval mi3 = new Interval(9,18);
        Interval mi4 = new Interval(1,3);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(mi1);
        intervals.add(mi2);
        intervals.add(mi3);
        intervals.add(mi4);

        mi.merge(intervals);

    }
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        Collections.sort(intervals,comp);
        //print(intervals); // 정렬 결과

        for(int i = 0; i<intervals.size()-1; i++) {
            if(intervals.get(i).end > intervals.get(i+1).start) {
                intervals.get(i).end = intervals.get(i+1).end;
                intervals.remove(intervals.get(i+1));
            }
        }
        //System.out.println("");
        print(intervals); // merge 결과

        return result;
    }
    Comparator comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    };

    /*void print(List<Interval> list) {
        System.out.print("[");
        for(int i = 0; i < list.size()-1; i++) {
            System.out.print(
                    "["+list.get(i).start + ","+ list.get(i).end+"]"+","
            );
        }
        System.out.print(
                "["+list.get(list.size()-1).start+","+list.get(list.size()-1).end+"]"+"]"
        );
    }*/
    void print(List<Interval> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(
                    list.get(i).start + ","+ list.get(i).end
            );
        }
    }

}

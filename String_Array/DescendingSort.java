package String_Array;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingSort {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "Rabbit", "tiger"};

        Arrays.sort(strArr, new Descending());
        System.out.println(Arrays.toString(strArr));
    }

}
class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1; // 역순 정렬을 위해 기본 정렬 기준에 -1을 곱한다.
        }
        // Comparable한 대상이 아니면 -1 반환
        return -1;
    }
}


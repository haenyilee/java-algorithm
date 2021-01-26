package String_Array;

import java.util.*;

class KClosest {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> queue = new PriorityQueue<>();

        for(int i=0; i<points.length; i++)
            queue.offer(new Point(points[i][0], points[i][1]));

        int[][] result = new int[k][2];

        for(int i=0; i<k; i++) {
            Point p = queue.poll();
            result[i][0] = p.x;
            result[i][1] = p.y;
        }
        return result;
    }
}
class Point implements Comparable<Point> {
    public int x;
    public int y;
    public int distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = x*x + y*y;
    }
    @Override
    public int compareTo(Point other) {
        return Integer.compare(distance,other.distance);
    }
}

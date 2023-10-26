
//wap to find the nearset k point to the orgin or nearest car from the origin
import java.util.*;
public class six
{
    static class point implements Comparable<point>{
        int x;
        int y;
        int distSq;
        int idx;
        public point(int x,int y,int distSq,int idx)
        {
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }

        @Override
        public int compareTo(point p2)
        {
            return this.distSq-p2.distSq;//sorting in ascending order
        }
    }
    public static void main(String[] args)
    {
        int points[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<point> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++)
        {
            int distSqur=points[i][0]*points[i][0]  +  points[i][1]*points[i][1];
            pq.add(new point(points[i][0], points[i][1], distSqur,i));
        }

        //nearset  K cars
        for(int i=0;i<k;i++)
        {
            System.out.println("C"+pq.remove().idx);
        }
    }
}

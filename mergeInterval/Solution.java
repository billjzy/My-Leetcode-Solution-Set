/**
 * Defination for an interval.
 * public class Interval{
 *   int start;
 *   int end;
 *   Interval(){start=0 ;end =0; }
 *   Interval(int s, int e) {start = s; end = e;}
 * }
 */
 import java. util.*;

public class Solution{
   public ArrayList<Interval> merge(ArrayList<Interval> intervals){
     // special cases
     if (intervals == null || intervals.size()<=1) return intervals;
     ArrayList<Interval> result = new ArrayList<Interval> ();
     // sort intervals by starts 
     // define a new intervalComparator object 
     Collections.sort(intervals , new intervalComparator());

     result.add(intervals.get(0));
     //there are three possibilities for intv1> intv2
     for (int i=1 ;i< intervals.size(); i++){
        Interval current=intervals.get(i);
        Interval last=result.get(result.size()-1);
        //intv1 included by intv2 
        if (current.end <= last.end){
          continue;
        }
        //two intervals overlap
        else if (last.end >= current.start){
          last.end = current.end;
        }
        // two intervals are seperate
        else result.add(current);
     }
   return result;
 }// 
    class intervalComparator implements Comparator<Interval>{
       public int compare (Interval intv1, Interval intv2){
         return intv1.start-intv2.start;
       }
   }
}

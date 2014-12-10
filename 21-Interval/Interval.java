import java.io.*;
import java.util.*;

public class Interval implements Comparable{
    private int low,high;
    private static Random r = new Random();
    private static int numIntervals = 0;
    public Interval(int l, int h){
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
    public Interval(){
	int a = r.nextInt(20) - 10;
	int b = a + 1 + r.nextInt(20);
	low = a;
	high = b;
	numIntervals = numIntervals + 1;
    }
    private int getLow(){
	return this.low;
    }
    private int getHigh(){
	return this.high;
    }
    /*private void setLow(Interval i){

    }
    private void setHigh(Interval i){

    }*/
    public String toString(){
	String result = /*"Interval " + numIntervals + ": " +*/"[" + low + "," + high + "]";
	return result;
    }
    public static void printstuff(){
	System.out.println("Stuff");
    }
    public int compareTo(Object other){
	/*cast other to the appropriate type and store in a local variable for
	convenience*/
	Interval o = (Interval)other;
    	//int num, Onum;
    	//num =a.getLow();
    	//Onum = b.getLow();
    	//System.out.println(num + " " + Onum);
    	if (this.low == o.low){
	    //num = a.getHigh();
	    //Onum = b.getHigh();
	    //System.out.println(num + " " + Onum);
	    return this.high - o.high;
    	} else{
	    return this.low - o.low;
	}
    }
    public static void main(String[] args){
	//for (int i=0;i<10;i++){
	//    System.out.println(new Interval());
	//}
	Interval i = new Interval();
	//i.printstuff();
        //printstuff();
	//Interval.printstuff();
	Interval[] a = new Interval[10];
	for (int n=0;n<a.length;n++){
	    a[n] = new Interval();
	}
	System.out.println(Arrays.toString(a));
    for (int n=0;n<a.length-1;n++){
    	System.out.println(a[n].compareTo(a[n+1]));
    }
    }
}

import java.io.*;
import java.util.*;

public class Interval{
    private int low,high;
    Random r = new Random();
    private static int numIntervals = 0;
    public Interval(int l, int h){
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
    public Interval(){
	int a = r.nextInt(100) - 50;
	int b = a + 1 + r.nextInt(100);
	low = a;
	high = b;
	numIntervals = numIntervals + 1;
    }
    /*private int getLow(Interval i){
	return 0;
    }
    private int getHigh(Interval i){
	return 0;
    }
    private void setLow(Interval i){

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
    }
}

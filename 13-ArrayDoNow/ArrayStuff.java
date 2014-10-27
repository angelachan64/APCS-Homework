import java.util.*;

public class ArrayStuff{
    private Random rand;
    private int[] a;
    public final int final_example = 123;
    public ArrayStuff(int n){
	rand = new Random();
	a = new int[100];
	for (int i=0;i<a.length;i++){
	    a[i] = rand.nextInt(76)+75;
	}
    }
  /*public String toString(){
        String s = "" + a.length;
        final_example = 321;
        s = s + final_example;
        return s;
    }*/
    public static void main(String[] args){
	ArrayStuff as = new ArrayStuff(100);
	System.out.println(as);
	System.out.println();
	System.out.println(as.find(109));
	System.out.println(as.maxVal());
    }
    public String toString(){
	String s = "";
	for (int i=0;i<a.length;i++){
	    s = s + a[i]+", ";
	}
	return s;
    }
    public int find(int value){
	int count = 0;
	int result = -1;
	while (count < a.length && result == -1){
	    if (a[count] == value){
		result = count;
	    }
	    count = count + 1;
	}
	return result;
    }
    public int maxVal(){
	int count = 0;
	int result = 0;
	while (count < a.length){
	    if (a[count] > result){
		result = a[count];
	    }
	    count = count + 1;
	}
	return result;
    }
}

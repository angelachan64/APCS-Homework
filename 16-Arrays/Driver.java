import java.io.*;
import java.util.*;

public class Driver2{
    public static void main(String[] args){
	/*ArrayList<String> al = new ArrayList<String>();
	System.out.println(al);
	al.add("hello");
	System.out.println(al);

	al.add("World");
	System.out.println(al);

	al.add("33");
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.get(1));*/

	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0;i < 20;i++){
	    ai.add(r.nextInt(5));
	}
	System.out.println(ai);
	int num = ai.get(0);
	for (int i=1;i<ai.size();i++){
	    while (ai.get(i) == num){
		ai.remove(i);
	    }
	    if (i<ai.size()){
		num = ai.get(i);
	    }
	}
	System.out.println(ai);
    }
}

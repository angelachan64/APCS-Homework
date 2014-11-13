import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[]args){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<10;i++){
	    ai.add(r.nextInt(5));
	}
	ArrayList<Integer> fin = new ArrayList<Integer>();
	for (int i=0;i<ai.size();i++){
	    fin.add(-1);
	}
	System.out.println(ai);
	System.out.println(fin);
	
	int num;
	int ind = r.nextInt(ai.size());
	for (int i=0;i<ai.size();i++){
	    num = ai.get(i);
	    while (fin.get(ind) == -1){
		if (fin.get(ind) == -1){
		    fin.set(ind,num);
		}
		else{
		    ind = r.nextInt(ai.size());
		}
	    }
	}
	System.out.println(fin);
    }
}

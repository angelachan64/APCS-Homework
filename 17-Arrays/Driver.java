import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[]args){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<10;i++){
	    ai.add(i);
	}
	ArrayList<Integer> fin = new ArrayList<Integer>();
	for (int i=0;i<ai.size();i++){
	    fin.add(-1);
	}
	System.out.println(ai);
	System.out.println(fin);
	
	int num;
	int ind = r.nextInt(ai.size());
	while (fin.contains(-1)){
	for (int i=0;i<ai.size();i++){
	    num = ai.get(i);
	    //System.out.println(num + " " + ind + " " + fin.get(ind));
		if (fin.get(ind) == -1){
		    fin.set(ind,num);
		}
		else{
			while (fin.get(ind) != -1){
		    	ind = r.nextInt(ai.size());
		    	if (fin.get(ind)==-1){
		    		fin.set(ind,num);
		    		System.out.println(fin);
		    		break;
		    	}
			}
		}
			//System.out.println(num + " " + ind + " " + fin.get(ind));
	    ind = r.nextInt(ai.size());
	}
	}
	System.out.println(fin);
    }
}

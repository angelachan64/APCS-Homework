import java.io.*;
import java.util.*;

public class Randomize{
    public static void main(String[] args){
	Randomize r = new Randomize();
	ArrayList<Integer> l = new ArrayList<Integer>();
	if (args.length<2){
	    System.exit(0);
	}
	String choice = args[0];
	int size = Integer.parseInt(args[1]);
	for (int i=0;i<size;i++){
	    l.add(i);
	}
	//System.out.println(l);
	if (choice.equals("1"))
	    l = r.shuffle1(l);
	else if (choice.equals("2"))
	    l = r.shuffle2(l);
	else if (choice.equals("3"))
	    l = r.shuffle3(l);
	//System.out.println(l);
    }
    Random rnd = new Random();
    /* puts result in new ArrayList and returns it */
    public ArrayList<Integer> shuffle1(ArrayList<Integer> l){
	ArrayList<Integer> result = new ArrayList<Integer>();
	while (l.size()>0){
	    int i = rnd.nextInt(l.size());
	    int v = l.remove(i);
	    result.add(v);
	}
	return result;
    }
    /* puts result in the same ArrayList */
    public ArrayList<Integer> shuffle2(ArrayList<Integer> l){
	/*
	  len = l.size();
	  1) choose a random element from 0 to len
	  2) remove it
	  3) add it to the end
	  4) subtract one from len
	  5) go back to 1 until len = 0
	*/
	for (int len=l.size();len > 0;len--){
	    int i = rnd.nextInt(len);
	    int v= l.remove(i);
	    l.add(v);
	}
	return l;
    }
    /* puts the result in the same ArrayList but doesn't use remove */
    public ArrayList<Integer> shuffle3 (ArrayList<Integer> l){
	/*
	  len = l.size();
	  1. choose a random element from 0 to len
	  2. swap with l[len-1]
	  3. subtract one from len
	  4. go back to 1 until len = 0
	*/
	for (int len = l.size();len > 0;len--){
	    int i = rnd.nextInt(len);
	    int tmp = l.get(i);
	    l.set(i,l.get(len-1));
	    l.set(len-1,tmp);
	}
	return l;
    }
}

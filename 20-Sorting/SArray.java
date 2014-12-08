import java.util.*;
import java.io.*;

public class SArray{
    public String[] data; //should be object[]
    public SArray(){
    	data = new String[10];
    	for (int j=0;j<data.length;j++){
    		data[j]="";
    	}
    }
    public SArray(int i){
	//start Array at size 10
	data = new String[i];
	for (int j=0;j<data.length;j++){
    	data[j]="";
    }
    }
    public boolean add(String i){
    	//if (size() == data.length){
	  //throw new ArrayIndexOutOfBoundsException();
	  //}
    	
    	if (data.length == size()){
	    String[] tempArray = new String[data.length + 5];
	    for (int n=0;n<data.length;n++){
		tempArray[n] = data[n];
	    }
	    data = new String[data.length + 5];
	    data = tempArray;
	    for(int n=0;n<data.length;n++){
		if(data[n].compareTo("") == 0){
		    data[n] = i;
		    break;
		}
	    }
    	}
    	else{
	    for(int n=0;n<data.length;n++){
		if(data[n].compareTo("") == 0){
		    data[n] = i;
		    break;
		}
	    }
    	}
	return true;
    }
    /*public void add(int index, String i){
    	/*if (index > data.length - 1 || index < 0){
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	if (data.length>size()){
			if (data[index] == 0){
			    data[index] = i;
			}
			else{
			    for(int n=data.length-1;n>index;n--){
					data[n] = data[n-1];
			    }
			    data[index] = i;
			}
    	}
    	else{
    		int[] tempArray = new int[data.length + 5];
    		for (int n=0;n<data.length;n++){
    			tempArray[n] = data[n];
    		}
    		data = tempArray;
			if (data[index] == 0){
			    data[index] = i;
			}
			else{
			    for(int n=data.length-1;n>index;n--){
					data[n] = data[n-1];
			    }
			    data[index] = i;
			}
    	}
    	
    }*/
    public void add(int index, String i){
    	/*if (index > data.length - 1 || index < 0){
	    throw new ArrayIndexOutOfBoundsException();
    	}*/
    	if (data.length>size()){
	    if (data[index].compareTo("") == 0){
		data[index] = i;
	    }
	    else{
		for(int n=data.length-1;n>index;n--){
		    data[n] = data[n-1];
		}
		data[index] = i;
	    }
    	}
    	else{
	    String[] tempArray = new String[data.length + 5];
	    for (int n=0;n<data.length;n++){
		tempArray[n] = data[n];
	    }
	    data = tempArray;
	    if (data[index].compareTo("") == 0){
		data[index] = i;
	    }
	    else{
		for(int n=data.length-1;n>index;n--){
		    data[n] = data[n-1];
		}
		data[index] = i;
	    }
    	}
    	
    }
    public int size(){
    	int result = 0;
    	for(int i=0;i<data.length;i++){
	    if (data[i].compareTo("") < 0){
		result = result + 1;
	    }
    	}
    	return result;
    }
    public String get(int index){
    	return data[index];
    }
    public String set(int index, String i){
    	String result = data[index];
    	data[index] = i;
    	return result;
    }
    public String remove(int index){
    	String result = data[index];
    	data[index] = "";
    	return result;
    }
    public String toString(){
	String s = "";
	for (int i=0;i<data.length;i++){
	    s = s + "Element " + i + " is " + data[i] + "\n";
	}
	return s;
    }
    /*public void test(Object x){
      if (x == (int)x){
      throw new ArrayStoreException();
      }
      System.out.println("Works fine.");
      }*/
    public void isort(){
    	for (int i=0;i<data.length;i++){
	    int ind=0;
	    String newvalue = data[i];
	    for (ind = i; ind > 0 && newvalue.compareTo(data[ind-1])<0;ind--){
    		data[ind] = data[ind-1];
		//System.out.println(ind);
	    }
	    data[ind]=newvalue;
    	}
    }
    public void ssort(){
	String temp, swap;
	int ind = 0;
	for (int i=0;i<data.length;i++){
	    temp = data[i];
	    swap = data[i];
	    ind = i;
	    for (int n=i;n<data.length;n++){
	        if (temp.compareTo(data[n]) > 0){
		    temp = data[n];
		    ind = n;
		}
	    }
	    data[ind] = swap;
	    data[i] = temp;
	}
    }
    public void bsort(){
    	String temp,swap;
    	int count = 0;
    	while (count<data.length){
    		for (int i=0;i<data.length-1;i++){
    			temp = data[i];
    			swap = data[i+1];
    			if (temp.compareTo(swap)>0){
    				data[i] = swap;
    				data[i+1] = temp;
    				count = 0;
    			}
    			else{
    				count++;
    			}
    		}
    	}
    }
    
    /* MAIN FUNCTION */
    
    public static void main(String[] args){
	SArray as = new SArray(10);
	//System.out.println(as.toString());
	/*as.add(5);
	as.add(7);
	as.add(1,8);
        as.add(3,9);
        as.add(2);
        as.add(4);
        as.add(5);
        as.add(6);
        as.add(1);
        as.add(7);
        try{
	    as.add(99,4);
	    System.out.println("worked");
        } catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("We got a " + e + " error");
        } catch(Exception e){
	    System.out.println("Some other Error");
        }
	//System.out.println(as.toString());
	as.set(2,4);
	//System.out.println("There are " + as.size() + " elements in this array.");
	//System.out.println("The item at position 2 used to be " + as.set(2,4) + ".");
	//System.out.println("The item at position 2 is now " + as.get(2) + ".");
	as.remove(2);
	as.add(3);
	as.add(5);
	as.add(2);
	as.add(6);
	as.add(3);
	System.out.println(as.toString());
	as.add(3,8);*/
	//System.out.println("After removal, the item at position 2 is now " + as.get(2) + ".");
	as.add("hello");
	as.add("whee");
	as.add("kittens");
	as.add("kermit");
	as.add("marbles");
	as.add("peach");
	as.add("willywonka");
	as.add("chocolate");
	as.add("poop");
	as.add("playground");
	as.add("pretend");
	as.add("realize");
	as.add("grow");
	as.add("before");
	as.add("innocent");
	as.add("unreal");
	as.add("pinch");
	as.add("movie");
	as.add("friend");
	//as.isort();
	//as.ssort();
	as.bsort();
	System.out.println(as.toString());
    }
}

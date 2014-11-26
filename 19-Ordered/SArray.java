import java.util.*;

public class SArray{
    public E[] data; //should be object[]
    public SArray(int i){
	//start Array at size 10
	data = new int[i];
    }
    public boolean add(int i){
    	/*if (size() == data.length){
	  throw new ArrayIndexOutOfBoundsException();
	  }
    	*/
    	if (data.length == size()){
	    int[] tempArray = new int[data.length + 5];
	    for (int n=0;n<data.length;n++){
		tempArray[n] = data[n];
	    }
	    data = tempArray;
	    for(int n=0;n<data.length;n++){
		if(data[n]==0){
		    data[n] = i;
		    break;
		}
	    }
    	}
    	else{
	    for(int n=0;n<data.length;n++){
		if(data[n]==0){
		    data[n] = i;
		    break;
		}
	    }
    	}
	return true;
    }
    public void add(int index, int i){
    	if (index > data.length - 1 || index < 0){
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
    	
    }
    public int size(){
    	int result = 0;
    	for(int i=0;i<data.length;i++){
	    if (data[i] != 0){
		result = result + 1;
	    }
    	}
    	return result;
    }
    public int get(int index){
    	return data[index];
    }
    public int set(int index, int i){
    	int result = data[index];
    	data[index] = i;
    	return result;
    }
    public int remove(int index){
    	int result = data[index];
    	data[index] = 0;
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
    
    
    /* MAIN FUNCTION */
    
    public static void main(String[] args){
	SArray as = new SArray(10);
	//System.out.println(as.toString());
	as.add(5);
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
	as.add(3,8);
	//System.out.println("After removal, the item at position 2 is now " + as.get(2) + ".");
	System.out.println(as.toString());
    }
}

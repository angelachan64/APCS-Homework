import java.util.*;

public class SArray{
    private int[] data; //should be object[]
    public SArray(int i){
	//start Array at size 10
	data = new int[i];
    }
    public void add(int i){
	for(int n=0;n<data.length;n++){
	    if(data[n]==0){
		data[n] = i;
		break;
	    }
	}
    }
    public void add(int index, int i){
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
    public int get(int index){
	return 0;
    }
    public void set(int index, int i){

    }
    public int size(){
	return 0;
    }
    public void remove(int index){

    }
    public String toString(){
	String s = "";
	for (int i=0;i<data.length;i++){
	    s = s + "Element " + i + " is " + data[i] + "\n";
	}
	return s;
    }
    public static void main(String[] args){
	SArray as = new SArray(10);
	System.out.println(as.toString());
	as.add(5);
	as.add(7);
        as.add(1, 8);
	System.out.println(as.toString());
    }
}

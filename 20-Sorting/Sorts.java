import java.io.*;
import java.util.*;

class Sorts {
    int[] data;
    int[] copy;
    Random r;
    public int count = 0;
    public int comp = 0;
    public Sorts(int n){
	r = new Random();
	data = new int[n];
	copy = new int[n];
	fill();
				
    }

    public Sorts() {
	this(100000);
    }

    public void fill(){
	for (int i = 0; i < data.length; i++) {
	    data[i]=r.nextInt(100);
	}
    }

    public void backup() {
	for (int i = 0; i < data.length; i++) {
	    copy[i] = data[i];
	}
    }
    public void restore() {
	for (int i = 0; i < data.length; i++) {
	    data[i] = copy[i];
	}
    }


    public void isort() {
	int i,j;
	for (i = 1; i < data.length; i++) {
	    int tmp=data[i];
	    for (j=i-1 ; j >= 0 && tmp < data[j];j--) {
		data[j+1]=data[j];
		count++;
		comp++;
	    }
	    data[j+1]=tmp;
	    comp++;
	}
    }


    public void ssort() {
	int i,j;
	int mi;
	for ( i = 0; i < data.length-1; i++) {
	    mi = i;
	    for (j=i+1;j<data.length;j++) {
		if (data[j]<data[mi]){
		    mi=j;
		    count++;
		}
	    }
	    int tmp=data[mi];
	    data[mi]=data[i];
	    data[i]=tmp;
	    comp += 3;
	}
    }
    public void bsort(){
    	int temp,swap;
    	int c = 0;
    	while (c<data.length){
    		for (int i=0;i<data.length-1;i++){
    			temp = data[i];
    			swap = data[i+1];
    			comp += 2;
    			if (temp > swap){
    				data[i] = swap;
    				data[i+1] = temp;
    				c = 0;
    				count++;
    			}
    			else{
    				c++;
    			}
    		}
    	}
    }

    public void builtin() {
	/* this sorts the whole array, if you want to sort only some of it
	   you would write Arrays.sort(data,0,n) where n is the index beyond the 
	   stopping point */
			 
	Arrays.sort(data);

	/* for an ArrayList, you would use Collections.sort(list) */
    }
    public String toString() {
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s+data[i]+" ";
	}
	return s;
    }
    public static void main(String[] args) {
	Sorts s = new Sorts();
	//System.out.println(s);
	//s.builtin();
	//s.ssort();
	//s.isort();
	s.bsort();
	//System.out.println(s);
	System.out.println("Comparisons are " + s.count);
	System.out.println("Assignments are " + s.comp);
    }
}

import java.io.*;
import java.util.*;

public class OrderedSuperArray extends SArray{
    public static void main(String[] args){
	OrderedSuperArray osa = new OrderedSuperArray(10);
    }
    public OrderedSuperArray(int i){
	data = new String[i];
	super.toString();
    }
    public void add(String s){
	int length = s.length();
	int i = 0;
	while (length < super.get(i)){
	    i++;
	}
	
    }
}

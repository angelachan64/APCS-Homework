import java.util.*;

public class Driver{
    public static void main(String[] args){
	int[] intArray;
	intArray = new int[100];
	int count = 0;
	Random r = new Random(76);
	while (count < 100){
	    intArray[count] = r.nextInt(76) + 75;
	    count = count + 1;
	}
	count = 0;
	while (count < 20){
	    System.out.println(intArray[count]);
	    count = count + 1;
	}
    }
}

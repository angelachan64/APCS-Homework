import java.util.*;
import java.io.*;

public class Driver{
	//public static Random r = new Random();
    public static void main(String[]args){
	Assassin[] a = new Assassin[10];
	Random r = new Random();
	String[] names = new String[]{"Diddles", "Groot", "Harry Potter", "Pikachu",
	"Blue Eyes White Dragon", "Hamburglar", "Barbie", "Power Ranger", "Brock",
	"Sailor Moon", "Tom", "Jerry", "Mickey Mouse", "Hercules", "Plankton",
	"Buttercup", "Blossom", "Bubbles"};
	ArrayList<Integer> inds = new ArrayList<Integer>();
	for (int i=0;i<a.length;i++){
		int index = r.nextInt(a.length);
		if (inds.contains(index)){
			i--;
		} else{
	    	a[i] = new Assassin(names[index]);
	    	inds.add(index);
		}
	}
    System.out.println(Arrays.toString(a));
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    }
}

import java.util.*;

public class Driver{
    public static void main(String[]args){
	Random r = new Random(10);
	for (int i=0;i<10;i++){
	    //int val = (int)(Math.random()*100);
	    //System.out.println(val);
	    System.out.println(r.nextInt(100));
	}
	Scanner sc = new Scanner(System.in);
	String input = "";
	while (!input.equals("done")){
	    System.out.println("Enter a value:");	    
	    input = sc.nextLine();
	    System.out.println(input);
	}
    }
}

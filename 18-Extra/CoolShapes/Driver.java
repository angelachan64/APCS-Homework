import java.util.*;
import java.io.*;

/*
so we basically just have to add in spaces right??? and then like not have other things
in other places???
*/

public class Driver{
    public static void main(String[] args){
    	Random r = new Random();
	    WordSearch ws = new WordSearch();
	    /*String[] words = new String[]{"bacon", "brownies", "pancakes", "cookies",
	    "steak", "spaghetti", "apple", "orange", "banana", "hamburger", 
	    "biscuit", "blackberry", "cheesecake", "lasagna", "lobster", "macaroon", 
	    "marshmallow", "noodles", "oatmeal", "pizza", "sushi", "pineapple", 
	    "parsnip", "pomegranate", "persimmon", "pumpernickel", "sesame", 
	    "spinach", "scallops", "risotto", "ravioli", "watermelon"};*/
	    Scanner sc=null;
	    try{
		sc = new Scanner(new File("words.txt"));
	    } catch (Exception e){
		System.out.println("ur poop");
		System.exit(0);
	    }
	    ArrayList<String> words = new ArrayList<String>();
	    while (sc.hasNext()){
		String s = sc.next();
		words.add(s);
	    }
	    
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    int index;
	    int count = 0;
	    //for (int i=0;i<30;i++){
	    while(count<30){
	    	index = r.nextInt(words.size());
	    	while (al.contains(index)){
		    index = r.nextInt(words.size());
	    	}
	    	if(ws.addWord(words.get(index))){
	    	al.add(index);
	    	count++;
	    	}
	    }

	    ws.fill();
	    System.out.println(ws.toString());
	    String s = "";
	    int num = 0;
	    int spaces;
	    for (int i=0;i<al.size();i++){
		spaces = 15 - words.get(al.get(i)).length();
		s += words.get(al.get(i));
		while (spaces>0){
		    s += " ";
		    spaces--;
		}
		num++;
		if (num == 5){
		    s += "\n";
		    num = 0;
		}
	    }
	    System.out.println(s);
	    System.out.println(count);
    }
}

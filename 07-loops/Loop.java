/* 
   Write a method that will return a string representing a box of '*'s
   i.e. box(4,3) will return:
      ***
      ***
      ***
      ***
   will return a /n in the string to represent a new line
*/

public class Loop{
    public String box(int r, int c){
	String s = "";
	int r1 = r;
	while (c>0){
	    while (r1>0){
		s = s + "*";
		r1 = r1 - 1;
	    }
	    s = s + "\n";
	    r1 = r;
	    c = c - 1;
	}
	return s;
    }
}

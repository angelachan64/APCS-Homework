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
	int c1 = c;
	while (r>0){
	    while (c1>0){
		s = s + "*";
		c1 = c1 - 1;
	    }
	    s = s + "\n";
	    c1 = c;
	    r = r - 1;
	}
	return s;
    }
}

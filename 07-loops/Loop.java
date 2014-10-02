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
    public String Tri1(int c){
	String s = "";
	int star = 1;
	int c1 = 1;
	while (c > 0){
	    while (star <= c1){
		s = s + "*";
		star = star + 1;
	    }
	    s = s + "\n";
	    c = c - 1;
	    c1 = c1 + 1;
	    star = 1;
	}
	return s;
    }
    public String Tri2(int c){
	String s = "";
	int count = 1;
	int n = c;
	int space = c-1;
	while (c>0){
	    while (space>0){
		s = s + " ";
		space = space - 1;
	    }
	    while (count>0){
		s = s + "*";
		count = count - 1;
	    }
	    s = s + "\n";
	    c = c - 1;
	    space = c - 1;
	    count = n - space;
	}
	return s;
    }
}

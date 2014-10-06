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
    /* HOMEWORK 7A */
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
    /*
    public String tri2(int h){
	int row = 0;
	int i;
	String s = "";
	while (row<h){
	    i = 0
		while (i<h-row-1){
		    s = s + " ";
		    i++;
		}
	    i = 0;
	    while(i<row+1){
		s = s + "*";
		i++;
	    }
	    s = s + "\n";
	    row++;
	}
	return s;
    }
    */
    /* HOMEWORK 7B */
    public String Tri3(int h){
	int c1 = 0;
	String s = "";
	int h1 = h-1;
	int star = 1;
	while (h>0){
	    while (h1>0){
		s = s + " ";
		h1 = h1 - 1;
	    }
	    while (star>0){
		s = s + "*";
		star = star - 1;
	    }
	    s = s + "\n";
	    c1 = c1 + 1;
	    star = 2*c1 + 1;
	    h = h - 1;
	    h1 = h - 1;
	}
	return s;
    }
    public String diamond(int h){
	String s = "";
	int h1 = h;
	int count = 0;
	int base = 1;
	int sbase = h - 2;
	int space = sbase;
	int star = base;
	while (h > 0){
	    while (space>0){
		s = s + " ";
		space = space - 1;
	    }
	    space = sbase;
	    while (star > 0){
		s = s + "*";
		star = star - 1;
	    }
	    if (count < h1/2){
		base = base + 2;
		sbase = sbase - 1;
	    }
	    else{
		base = base - 2;
		sbase = sbase + 1;
	    }
	    s = s + "\n";
	    star = base;
	    space = sbase;
	    h = h - 1;
	    count = count + 1;
	}
	return s;
    }
    public String Tri4(int h){
	String s = "";
	int star = h;
	int base = h;
	int count = 0;
	int space = count;
	while (h>0){
	    while (space > 0){
		s = s + " ";
		space = space - 1;
	    }
	    while (star > 0){
		s = s + "*";
		star = star - 1;
	    }
	    base = base - 1;
	    count = count + 1;
	    star = base;
	    space = count;
	    s = s + "\n";
	    h = h - 1;
	}
	return s;
    }
    /* HOMEWORK 7B */
    public String frame(int r, int c){
	String s = "";
	int rcount = 1;
	int ccount = 1;
	int star = c;
	while (rcount < r){
	    if ((rcount == 1 || rcount == r) && star > 0){
		s = s + "*";
		star = star - 1;
	    }
	    else{
		if (ccount ==  1 || ccount == c){
		    s = s + "*";
		    ccount = ccount + 1;
		}
		else{
		    s = s + " ";
		    ccount = ccount + 1;
		}
	    }
	    rcount = rcount + 1;
	    ccount = 1;
	    star = c;
	}
	return s;
    }
    public String stringSplosion(String str){
	int i = 2;
	String s = str.substring(0,1);
	while (i<=str.length()){
	    s = s + str.substring(0,i);
	    i = i + 1;
	}
	return s;
    }
    public String stringX(String str){
	int i = 1;
	int len = str.length();
	String s = "";
	if (len != 0){
	    s = str.substring(0,1);
	    str = str.substring(1);
	}
	while (i<len){
	    if (i == len-1){
		s = s + str;
	    }
	    else{
		if (str.substring(0,1).compareTo("x")!=0){
		    s = s + str.substring(0,1);
		}
	    }
	    str = str.substring(1);
	    i = i + 1;
	}
	return s;
    }
}

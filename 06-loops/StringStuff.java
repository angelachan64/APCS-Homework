public class StringStuff{
    /* 3 MINUTES */
    public String frontTimes(String str, int n){
	int n1 = n;
	String s = "";
	if (str.length()<3){
	    while (n1>0){
		s = s + str;
		n1 = n1 - 1;
	    }
	}
	else{
	    String front = str.substring(0,3);
	    while (n1 > 0){
		s = s + front;
		n1 = n1 - 1;
	    }
	}
	return s;
    }
    /* 5 MINUTES */
    public String stringBits(String str){
	int count = 0;
	int len = str.length();
	String s = "";
	while (count<len){
	    if (count%2==0){
		s = s + str.substring(count,count+1);
		count = count + 1;
	    }
	    else{
		count = count + 1;
	    }
	}
	return s;
    }
    /* 25 MINUTES (I momentarily completely forgot the existence of indexOf) */
    public String stringYak(String str){
	int i = str.indexOf("yak");
	String s = "";
	while (i != -1){
	    if (i==0){
		str = str.substring(3);
		i = str.indexOf("yak");
	    }
	    else{
		s = s + str.substring(0,i);
		str = str.substring(i);
		i = str.indexOf("yak");
	    }
	}
	s = s + str;
	return s;
    }
    /* 5 MINUTES */
    public int stringMatch(String a, String b){
	int count = 0;
	while (a.length()>=2 && b.length()>=2){
	    String fronta = a.substring(0,2);
	    String frontb = b.substring(0,2);
	    if (fronta.compareTo(frontb)==0){
		count = count + 1;
		a = a.substring(1);
		b = b.substring(1);
	    }
	    else{
		a = a.substring(1);
		b = b.substring(1);
	    }
	}
	return count;
    }
}
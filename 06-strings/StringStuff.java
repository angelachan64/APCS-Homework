public class StringStuff{
    /*WORKING*/
    public String nonStart (String a, String b){
	String aend = a.substring(1);
	String bend = b.substring(1);
	return aend + bend;
    }
    /*WORKING*/
    public String makeAbba(String a, String b){
	return a + b + b + a;
    }
    /*WORKING*/
    public int diff21(int n){
	int a = Math.abs(21-n);
	if (n<21){
	    return a;
	}
	else{
	    return (a*2);
	}
    }
    /*WORKING*/
    public boolean nearHundred(int n){
	return ((Math.abs (n-100)<=10) || (Math.abs (n-200)<=10));
    }
    /*WORKING*/
    public boolean mixStart(String str){
	if (str.length()<3){
	    return false;
	}
	String factor = str.substring(1,3);
	if (factor.compareTo("ix")==0){
	    return true;
        }
	else{
	    return false;
	}
    }
    /*WORKING*/
    public int teaParty(int tea, int candy){
	if (tea < 5 || candy < 5){
	    return 0;
	}
	if(tea >= (2*candy) || candy >= (2*tea)){
	    return 2;
	}
	else{
	    return 1;
	}
    }
    /*WORKING*/
    public boolean lastDigit(int a, int b, int c){
	return (((a%10) == (b%10)) || (a%10) == (c%10)) || ((b%10) == (c%10));
    }
    public void test1(){
	String s1 = "shot";
	String s2 = "ssprings";
	String s3 = "man";
	int i = 24;
	System.out.println(nonStart(s1, s2));
	System.out.println(makeAbba(s1, s3));
	System.out.println(diff21(i));
    }
}
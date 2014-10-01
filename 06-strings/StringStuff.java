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

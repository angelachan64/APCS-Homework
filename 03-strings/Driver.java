public class Driver{
    public static void main(String[] args){
	String s = "angela chan";
	int space = s.indexOf(" ");
	String first = s.substring(0, space);
        String last = s.substring(space);
    }
}
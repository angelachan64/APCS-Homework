public class Greeter{
    private String greeting = new String("Hello World!");
  /*
    public void greet(){
	//String greeting = new String("'Sup!");
	System.out.println(greeting);
    }
  */
    public void setGreeting(String s){
	greeting = s;
    }
    public String getGreeting(){
	return greeting;
    }
    public String greet(){
	return greeting;
    }
    public void ungreet(){
	System.out.println("I'm out!");
    }
    public Greeter(String g){
	System.out.println("In the constructor");
	greeting = g;
    }
}

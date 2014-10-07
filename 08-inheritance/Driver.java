public class Driver{
    public static void main(String[]args){
	BaseChar c = new BaseChar();
	c.setHealth(150);
	System.out.println(c.getHealth());
	Warrior w = new Warrior();
	w.setHealth(200);
	System.out.println(w.getHealth());
    }
}

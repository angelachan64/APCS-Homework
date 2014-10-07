public class Driver{
    public static void main(String[]args){
	BaseChar c = new BaseChar();
	Warrior w = new Warrior();
	Mage m = new Mage();

	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getMana());
    }
}

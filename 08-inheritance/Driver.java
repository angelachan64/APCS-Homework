public class Driver{
    public static void main(String[]args){
	BaseChar c = new BaseChar(),c2;
	Warrior w = new Warrior(),w2;
	Mage m = new Mage(),m2;

	/*
	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getMana());
	c2 = new Mage();
	*/
	w.setName("Groo");
	m.setName();
	w.attack(m);
	m.attack(w);
	w.attack(w);
	System.out.println(w.toString());
    }
}

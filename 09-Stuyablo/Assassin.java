public class Assassin extends BaseChar{
    private int luckBoost = 10;
    private int dexBoost = 5;
    public Assassin(String name){
	super.inputName(name);
    }
    public String getName(){
	return super.getName();
    }
}
public class Archer extends BaseChar{
    private int dexBoost = 10;
    private int luckBoost = 5;
    public Archer(String name){
	super.inputName(name);
    }
    public String getName(){
	return super.getName();
    }
}
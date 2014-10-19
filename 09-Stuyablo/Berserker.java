public class Berserker extends BaseChar{
    private int healthBoost = 10;
    private int strengthBoost = 5;
    public Berserker(String name){
	super.inputName(name);
    }
    public String getName(){
	return super.getName();
    }
}
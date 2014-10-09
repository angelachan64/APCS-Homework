public class Mage extends BaseChar{
    private int mana = 200;
    public int getMana(){
	return mana;
    }
    public void setName(String name){
	super.this.name = name;
    }
    public void setName(){
	super.this.name = "Diddlysquat";
    }
    public void setNameMana(String name, int mana){
	super.this.name = name;
	super.this.mana = mana;
    }
}

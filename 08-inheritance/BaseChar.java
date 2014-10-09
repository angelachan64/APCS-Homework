/* Known as the superclass of Warrior */

public class BaseChar{
    private int health=20;
    private int mana = 0;
    public int getHealth(){
	return health;
    }
    public void setHealth(int i){
	health = i;
    }
    private String name;
    /*
    public void setName(String name){
	this.name = name;
    }
    public void setName(){
	this.name = "Diddlysquat";
    }
    */
    public String getName(){
	return name;
    }
    public void attack(BaseChar other){
	System.out.println(this.getName() + " is attacking " + other.getName());
    }
    public String toString(){
	return this.getName();
    }
}

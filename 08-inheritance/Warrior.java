/* Known as a subclass of BaseChar */

public class Warrior extends BaseChar{
    private int healthBoost = 5;
    private int health = 12345;
    public int getHealth(){
	return health + super.getHealth() + healthBoost;
    }
}

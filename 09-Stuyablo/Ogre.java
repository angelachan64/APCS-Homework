public class Ogre extends BaseChar{
    private int healthBoost = 15;
    public void boost(){
        super.addmaxhealth(this.healthBoost);
    }
}
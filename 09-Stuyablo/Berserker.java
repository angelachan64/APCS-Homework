public class Berserker extends BaseChar{
    private int healthBoost = 10;
    private int strengthBoost = 5;
    public void inputName(String name){
        super.inputName(name);
    }
    public String getName(){
        return super.getName();
    }
    public void boost(){
        super.addmaxhealth(this.healthBoost);
        super.addSTR(this.strengthBoost);
    }
    public String getStats(){
        String s = "";
        s = s + "Your health is " + this.getmaxhealth() + "\n";
        s = s + "Your mana is " + this.getmaxmana() + "\n";
        s = s + "Your strength is " + this.getSTR() + "\n";
        s = s + "Your defense is " + this.getDEF() + "\n";
        s = s + "Your intelligence is " + this.getINT() + "\n";
        s = s + "Your dexterity is " + this.getDEX() + "\n";
        s = s + "Your luck is " + this.getLUK();
        return s;
    }
}

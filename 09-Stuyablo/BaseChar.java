public class BaseChar{
    private int health,maxhealth = 20;
    private int mana,maxmana = 15;
    private int DEX = 10;
    private int STR = 10;
    private int DEF = 10;
    private int LUK = 10;
    private int INT = 10;
    private int CHA = 8;
    private int LVL = 1;
    private int EXP = 0;
    private int maxEXP = (5*LVL+10+(2*LVL));
    private int giveEXP = (LVL*2);
    private String name = "";
    public void inputName(String name){
	this.name = name;
    }
    public String getName(){
	return this.name;
    }
    public void levelUp(){
	this.LVL = LVL + 1;
	this.CHA = CHA + 2;
	this.EXP = 0;
    }
    public int getmaxhealth(){
	    return this.maxhealth;
    }
    public int getmaxmana(){
        return this.maxmana;
    }
    public int getSTR(){
        return this.STR;
    }
    public int getDEF(){
        return this.DEF;
    }
    public int getINT(){
        return this.INT;
    }
    public int getDEX(){
        return this.DEX;
    }
    public int getLUK(){
        return this.LUK;
    }
    public int getCHA(){
        return this.CHA;
    }
    public int getLVL(){
        return this.LVL;
    }
    public int getEXP(){
        return this.EXP;
    }
    public void addmaxhealth(int boost){
        this.maxhealth = getmaxhealth() + boost;
    }
    public void addmaxmana(int boost){
        this.maxmana = getmaxmana() + boost;
    }
    public void addSTR(int boost){
        this.STR = getSTR() + boost;
    }
    public void addDEF(int boost){
        this.DEF = getDEF() + boost;
    }
    public void addINT(int boost){
        this.INT = getINT() + boost;
    }
    public void addDEX(int boost){
        this.DEX = getDEX() + boost;
    }
    public void addLUK(int boost){
        this.LUK = getLUK() + boost;
    }
}
public class main BaseChar{
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
	this.level = level + 1;
	this.CHA = CHA + 2;
	this.EXP = 0;
    }
    public void getStat(String stat){
	
    }
    public void addStats(String stat,int change){
    }
}
import java.util.*;

public class Driver{
    public static void main(String[]args){
	BaseChar character = new BaseChar();
	Scanner sc = new Scanner(System.in);
	String input = "";
	while (character.getName().equals("")){
	    while (input.equals("")){
		System.out.println("Hello valiant peasant! What is your name?");
		input = sc.nextLine();
		character.inputName(input);
		input = "";
		System.out.println("Are you sure your name is "+character.getName()+"?");
		if (input.equals("Yes")){
		    System.out.println("Alright then");
		}
		else if(input.equals("No")){
		    input = "";
		}
	    }
	}
	input = "";
	while (input.equals("")){
	    System.out.println("Well, " + character.getName()+", are you a Berserker, a Necromancer, an Assassin, or an Archer?");
	    input = sc.nextLine();
	    if (input.equals("Berserker")){
		Berserker berserker = new Berserker(character.getName());
	    }
	    else if (input.equals("Necromancer")){
		Necromancer necromancer = new Necromancer(character.getName());
	    }
	    else if (input.equals("Assassin")){
		Assassin assassin = new Assassin(character.getName());
	    }
	    else if (input.equals("Archer")){
		Archer archer = new Archer(character.getName());
	    }
	    else{
		System.out.println("Um, sorry but that's not available to you...");
		input = "";
	    }
	}
    }
}
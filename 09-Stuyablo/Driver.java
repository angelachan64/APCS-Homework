import java.util.*;

public class Driver{
    public static void main(String[]args){
    	BaseChar character = new BaseChar();
    	Berserker berserker = new Berserker();
    	Necromancer necromancer = new Necromancer();
    	Assassin assassin = new Assassin();
    	Archer archer = new Archer();
		Scanner sc = new Scanner(System.in);
		String input = "";
		String charType = "";
		while (character.getName().equals("")){
		    while (input.equals("")){
			System.out.println("Hello valiant peasant! What is your name?");
			input = sc.nextLine();
			character.inputName(input);
			input = "";
			System.out.println("Are you sure your name is " + character.getName() + "?");
			input = sc.nextLine();
			if (input.equals("Yes")){
				System.out.println("Alright then");
			}
			else if (input.equals("No")){
				input = "";
			}
			else{
				System.out.println("Sorry, I only take Yes and No so let's start over!");
				input = "";
			}
		    }
		}
		input = "";
		while (input.equals("")){
			System.out.println("Well, " + character.getName() + ", are you a Berserker, a Necromancer, an Assassin, or an Archer?");
			input = sc.nextLine();
			if (input.equals("Berserker")){
				berserker.inputName(character.getName());
				charType = "Berserker";
				berserker.boost();
			}
			else if (input.equals("Necromancer")){
				necromancer.inputName(character.getName());
				charType = "Necromancer";
				necromancer.boost();
			}
			else if (input.equals("Assassin")){
				assassin.inputName(character.getName());
				charType = "Assassin";
				assassin.boost();
			}
			else if (input.equals("Archer")){
				archer.inputName(character.getName());
				charType = "Archer";
				archer.boost();
			}
			else{
				System.out.println("Um, sorry but that's not available to you...");
				input = "";
			}
		}
		input = "";
		while (input.equals("")){
			System.out.println("Would you like to check your stats?");
			input = sc.nextLine();
			if (input.equals("Yes")){
				if (charType.equals("Berserker")){
					System.out.println(berserker.getStats());
				}
				else if (charType.equals("Necromancer")){
					System.out.println(necromancer.getStats());
				}
				else if (charType.equals("Assassin")){
					System.out.println(assassin.getStats());
				}
				else if (charType.equals("Archer")){
					System.out.println(archer.getStats());
				}
			}
		}
	}
}
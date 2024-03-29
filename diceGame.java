import java.util.*;
import java.lang.*;


class diceGame{
	private static final int SIDE_OF_DICE = 6;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many players?");
		int playerNum = scanner.nextInt();
		scanner.nextLine();

		for(int i = 0; i < playerNum; i++){
			System.out.println("What is your name? ");
        		String name = scanner.nextLine();

			System.out.println("Hello, " + name + "!");


			System.out.println("Rolling the dice...");
			Random rand = new Random();
			int dice1 = rand.nextInt(SIDE_OF_DICE) + 1;
			int dice2 = rand.nextInt(SIDE_OF_DICE) + 1;
			int total = dice1 + dice2;
		
			System.out.println("Die 1: " + dice1 + 
					   "\nDie 2: " + dice2 + 
					   "\nTotal value: " + total);

			if(total > 7)
				System.out.println(name + " won!");
			else
				System.out.println(name + " lost...");
			System.out.println("\n");
		}
	}
}

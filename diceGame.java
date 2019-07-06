import java.util.*;
import java.lang.*;


class diceGame{
	private static final int SIDE_OF_DICE = 6;
	public static void main(String[] args){
		System.out.println("Rolling the dice...");
		Random rand = new Random();
		int dice1 = rand.nextInt(SIDE_OF_DICE) + 1;
		int dice2 = rand.nextInt(SIDE_OF_DICE) + 1;
		
		System.out.println("Die 1: " + dice1 + 
				   "\nDie 2: " + dice2 + 
				   "\nTotal value: " + (dice1 + dice2));
	}
}

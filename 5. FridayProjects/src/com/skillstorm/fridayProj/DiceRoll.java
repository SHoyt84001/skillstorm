package com.skillstorm.fridayProj;

public class DiceRoll {

		public static void main (String[] args) {
			
			double diceRoll = Math.random() ;
			
			int diceRoll2 = (int) (6 * diceRoll) + 1;
			
			System.out.println(diceRoll2);
			
			
			
		}
}

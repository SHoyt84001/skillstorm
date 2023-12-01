package com.skillstorm.Encapsulation;

public class TreasureTest {
	public static void main (String[] args) {
		
		Treasure defaultTreasure = new Treasure();
		Treasure treasureGems = new Treasure("Diamonds", "Rough Gems", "700");
		Treasure treasureJewelry = new Treasure("Golden Necklace", "Pure Gold Chain", "25000");
		Treasure treasureMagicItem = new Treasure("Shark Whisperer", 
				"Bejeweled Staff with at least 100 shark teeth", "600000");
		
		TreasureChest emptyTreasure = new TreasureChest(0, 0, 0, 0, false, defaultTreasure);
		TreasureChest treasureBag = new TreasureChest(1, 1, 1, 1, true, treasureGems);
		TreasureChest treasureBox = new TreasureChest(12, 8, 16, 6, false, treasureJewelry);		
		TreasureChest treasureDrop = new TreasureChest(28, 72, 3, 3, true, treasureMagicItem);
		
		System.out.println(emptyTreasure);
		System.out.println(treasureBag);
		System.out.println(treasureBox);
		System.out.println(treasureDrop);
		System.out.println(treasureMagicItem);
		
		System.out.println(emptyTreasure.getContents());
		
		for (Treasure item : treasureBox.getContents()) {
			System.out.println("Here's your treasure!" + " " + item);
		}
	}
}

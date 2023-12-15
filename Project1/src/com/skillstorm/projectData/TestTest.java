package com.skillstorm.projectData;

import com.skillstorm.PlayerClass.Player;

public class TestTest {
	
	public static void testSave() {
		Player player1 = new Player("CORRUPTED", 100, 20, 20, 0, 0);
		SaveLoad save = new SaveLoad(player1);
		save.save();
	}
	
	public static void main(String[] args) {
		System.out.println("It's working");
		testSave();
		testLoad();
	}
	
	public static void testLoad() {
		SaveLoad save = new SaveLoad(new Player());
		save.load();
		System.out.println(save.player);
	}
}

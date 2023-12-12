package com.skillstorm.projectData;

import java.io.*;

import com.skillstorm.PlayerClass.Player;

public class SaveLoad {
	Player player;
	
	public SaveLoad(Player player) {
		this.player = player;
	}
	
	public void save() {
		try (ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(new File("save.dat")))) {
			DataStorage ds = new DataStorage();
			
			ds.name = ds.name ;
			ds.hitPoints = ds.hitPoints; 
			ds.strength = ds.strength; 
			ds.stamina = ds.stamina; 
			ds.EXP = ds.EXP; 
			ds.score = ds.score;
			
			fileOut.writeObject(ds);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	
	public void load () {
		try {
			ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(new File("score.dat")));
			
			DataStorage ds = (DataStorage) fileIn.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

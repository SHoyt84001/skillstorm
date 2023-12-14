package com.skillstorm.projectData;

import java.io.*;

import com.skillstorm.PlayerClass.Player;

public class SaveLoad {
	
	Player player;
	
	public SaveLoad(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return this.player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void save() {
		try (ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(new File("testSave.dat")))) {
			DataStorage ds = new DataStorage();
			
			ds.name = player.getName();
			ds.hitPoints = player.getHP(); 
			ds.strength = player.getSTR(); 
			ds.stamina = player.getSTA(); 
			ds.EXP = player.getEXP(); 
			ds.score = player.getScore();
			
			fileOut.writeObject(ds);
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void load () {
		try {
			ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(new File("testSave.dat")));
			
			DataStorage ds = (DataStorage) fileIn.readObject();
			
			this.player = new Player(ds.name, ds.hitPoints, ds.strength, ds.stamina, ds.EXP, ds.score);
			fileIn.close();
		} catch (EOFException e) {
		    // Handle EOFException (end of file reached)
		    e.printStackTrace(); // or log the exception
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

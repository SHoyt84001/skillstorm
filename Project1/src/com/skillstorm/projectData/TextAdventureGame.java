package com.skillstorm.projectData;

import java.io.*;

public class TextAdventureGame {

    private int playerHealth;
    private int playerScore;
    private String playerName;

    // Constructor
    public TextAdventureGame(String playerName) {
        this.playerName = playerName;
        this.playerHealth = 100; // Initial health
        this.playerScore = 0;   // Initial score
    }

    // Method to display current game state
    public void displayGameState() {
        System.out.println("Player: " + playerName);
        System.out.println("Health: " + playerHealth);
        System.out.println("Score: " + playerScore);
    }

    // Method to save the game state to a file
    public void saveGame(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
            System.out.println("Game saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load the game state from a file
    public static TextAdventureGame loadGame(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (TextAdventureGame) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        TextAdventureGame game = new TextAdventureGame("Player1");
        game.displayGameState();

        // Save game state
        game.saveGame("saveFile.ser");

        // Simulate changes in game state
        game.playerHealth -= 20;
        game.playerScore += 50;
        game.displayGameState();

        // Load game state
        TextAdventureGame loadedGame = TextAdventureGame.loadGame("saveFile.ser");
        if (loadedGame != null) {
            System.out.println("\nLoaded game state:");
            loadedGame.displayGameState();
        }
    }
}

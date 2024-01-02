package com.skillstorm.WeekSixFriday;

public class TestPlaylist {
	
	public static void main(String[] args) {
		
		PlaylistManager playlistManager = new PlaylistManager();
		
		playlistManager.addSong(new Song("Currents Track 1 - Tame Impala"));
		playlistManager.addSong(new Song("Currents Track 2 - Tame Impala"));
		playlistManager.addSong(new Song("Currents Track 3 - Tame Impala"));
		playlistManager.addSong(new Song("Currents Track 4 - Tame Impala"));
		
		playlistManager.displayPlaylist();
		
		playlistManager.play();
		
		
	}
}

package com.skillstorm.WeekSixFriday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager {
	
	private LinkedList<Song> playlist;
	private ListIterator<Song> iterator;
	
	public PlaylistManager() {
		playlist = new LinkedList<>();
		iterator = playlist.listIterator();
	}
	
	public void addSong(Song song) {
		playlist.add(song);
	}
	
	public void displayPlaylist() {
		System.out.println("Full playlist: ");
		for(Song item : playlist) {
			System.out.println(item.getName());
		}
		System.out.println("");
	}
	
	public void play() {
		if (playlist.isEmpty()) {
			System.out.println("Playlist is empty! Feel free to add some songs to play some music!");
		}
		
		System.out.println("Playing your playlist: ");
		
		iterator = playlist.listIterator();
		
		while (iterator.hasNext()) {
			Song currentSong = iterator.next();
			System.out.println("Now playing: " + currentSong.getName());
			
			if (!iterator.hasNext()) {
				System.out.println("End of the playlist.");
			} else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}

class Song {
	private String name;
	
	public Song(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
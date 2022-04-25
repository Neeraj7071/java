package com.masai;

import java.util.*;
public class PlayList {
	private ArrayList<Song> ListOfSong=new ArrayList<Song>();
	private boolean check=true;
	public void addSong(Song song) {
		this.ListOfSong.forEach(
		(n)->{
			if(n.getSongName().equals(song.getSongName())&& n.getMovieName().equals(song.getMovieName())) {
				System.out.println("Song is already added to the playlist");
				this.check=false;
			}
		}
		);
		if(check) {
			this.ListOfSong.add(song);
			System.out.println("Song added to the playlist successfully.");
			}
		this.check=true;
		
	}
	public void play() {
		for(Object i:this.ListOfSong) {
			Song playSong=(Song)i;
			playSong.play();
		}
	}
}

package com.masai;

public class Song {
	private String movieName;
	private String songName;
	public void play() {
		System.out.println(this.songName+" of "+this.movieName+" is playing...!");
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
}

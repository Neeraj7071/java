package com.masai;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Song song1=new Song();
		Song song2=new Song();
		Song song3=new Song();
		Song song4=new Song();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter song 1  songname");
		song1.setSongName(sc.next());
		System.out.println("Enter song 1 moviename");
		song1.setMovieName(sc.next());
		System.out.println("Enter song 2  songname");
		song2.setSongName(sc.next());
		System.out.println("Enter song 2 moviename");
		song2.setMovieName(sc.next());
		System.out.println("Enter song 3  songname");
		song3.setSongName(sc.next());
		System.out.println("Enter song 3 moviename");
		song3.setMovieName(sc.next());
		System.out.println("Enter song 4  songname");
		song4.setSongName(sc.next());
		System.out.println("Enter song 4 moviename");
		song4.setMovieName(sc.next());
		PlayList playList=new PlayList();
		playList.addSong(song1);
		playList.addSong(song2);
		playList.addSong(song3);
		playList.addSong(song4);
		playList.play();
	}
}

package com.java.ex10;

public class Song {
	
	//필드
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	//기본생성자
	public Song() {
		
	}
	
	//5개
	
		public Song(String title, String artist, String album, String composer, int year) {
			//메모리
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.composer = composer;
			this.year = year;
		}
	
	
	//6개
	public Song(String title, String artist, String album, String composer, int year, int track) {
		
		//this() 다른 생성자를 호출
		this(title,artist,album,composer,year);
		
		//메모리
		/*this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;*/
		
		this.track = track;
	}
	
	//매소드 gs
	//매소드 일반
	
	
	public void showInfo() {
		System.out.println(artist+","+title+"("+album+","+year+","+track+"번 track"+","+composer+" 작곡)");
	}
	
}

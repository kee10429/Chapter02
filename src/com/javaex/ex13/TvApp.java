package com.javaex.ex13;

public class TvApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv();
		
		tv.setPower(true);
		tv.setVolume(120);
		tv.status();
		
		tv.setVolume(false);
		tv.status();
		
		tv.setVolume(false);
		tv.status();
		
		tv.setChannel(0);
		tv.status();
		
		tv.setChannel(true);
		tv.setChannel(true);
		tv.setChannel(true);
		tv.status();
		
		tv.setPower(false);
		tv.status();
	}

}

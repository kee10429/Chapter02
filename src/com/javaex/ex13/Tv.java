package com.javaex.ex13;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자
	public Tv() {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}
	
	
	//매소드-gs
	public int getChannel(){
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	//-----------------------------------
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setChannel(int channel) {
		if(channel>255) {
			channel=255;
		} else if(channel<1) {
			channel = 1;
		}
		this.channel = channel;
	}
	
	public void setChannel(boolean c) {
		if(c==true) {
			channel = channel + 1;
		} else if (c==false) {
			channel = channel - 1;
		}
	}
	
	public void setVolume(int volume) {
		if(volume>100) {
			volume=100;
		} else if(volume<0) {
			volume = 0;
		}
		this.volume = volume;
	}
	
	public void setVolume(boolean v) {
		if(v=true) {
			volume = volume + 1;
		} else if (v=false) {
			volume = volume - 1;
		}
	}
	
	//매소드-일반
	
	public void status() {
		String p;
		if(power=true) {
			p = "on";
		} else {
			p = "off";
		}
		
		System.out.println("파워:"+p+"   "+"채널:"+channel+"   "+"볼륨:"+volume);
	}
	
}

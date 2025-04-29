package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메모리에 올리고
		Goods camera = new Goods();
		Goods cup = new Goods();
		Goods computer = new Goods();
		
		//니콘세팅
		camera.setName("니콘");
		camera.setPrice(400000);
		
		//머그컵세팅
		cup.setName("머그컵");
		cup.setPrice(20000);
		
		//LG그램세팅
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		//니콘출력
		String cameraName = camera.getName();
		int cameraPrice = camera.getPrice();
		camera.showinfo();
		
		//머그컵출력
		String cupName = cup.getName();
		int cupPrice = cup.getPrice();
		cup.showinfo();
		
		//LG그램출력
		String computerName = computer.getName();
		int computerPrice = computer.getPrice();
		computer.showinfo();
		
	}

}

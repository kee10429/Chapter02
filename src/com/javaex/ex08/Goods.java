package com.javaex.ex08;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	
	
	public Goods() {//기본생성자-자동-다른 생성자가 있으면 자동으로 생기지 않는다
		//메모리에 올리는일(중요한 일을 해주는 것)
	}
	
	public Goods(String name, int price) {
		//메모리에 올리는일(엄청난 걸 해준다)
		this.name = name;
		this.price = price;
	}
	
	//매소드
	//setter
	public void setName(String n){
		name = n;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("===============================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("===============================");
	}
	
	
}

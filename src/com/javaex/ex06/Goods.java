package com.javaex.ex06;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	
	//매소드gs
	
	//set
	public void setName(String n){
		name = n;
	}
	
	public void setPrice(int p) {
		price=p;
	}
	
	//get
	public String getName(){
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	//매소드 일반
	public void showinfo() {
		System.out.println("상품이름:"+ name + "가격:" + price);
	}
	
}

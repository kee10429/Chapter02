package com.javaex.ex02;


//class(틀)
public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	
	//매소드 gs
	//매소드 일반
	
	//name 값 입력
	public void setName(String n){
		// n이 "니콘"
		// 위에 있는 name에 입력해주기
		name = n;
		//return 필요없는 경우
		//return이 없는 경우 void라고 채움
	}
	
	//name 값 읽어보기
	public String getName(){
		return name;
	}
	
	//price 값 입력
	public void setPrice(int p) {
		price = p;
	}
	
	//price 값 읽어보기
	public int getPrice() {
		return price;
	}

	
}	

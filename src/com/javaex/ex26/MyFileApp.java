package com.javaex.ex26;

import java.util.Scanner;

//정우성
public class MyFileApp {
	
	public static void main(String[] args) {
	
		/*
		Scanner sc = new Scanner(System.in);
		= new MyFile();
		*/
		
		MyFile mf = new MyFile();
		String str = mf.read("C:\\javaStudy\\java\\주소록.txt");
		System.out.println(str);

	
	
	
	}
}
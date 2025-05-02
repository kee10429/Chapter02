package com.javaex.ex19;

public class Student extends Person {
	//필드
	private String schoolName;


	//생성자
	public Student() {
		super("이효리",22);
		System.out.println("Student()");
	} 

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	
	public student(String name, int age, String schoolName) {
		name, age ==> 부모쪽에 저장
				
		super(name, age);
		this.schoolName = schoolName; 자신이 저장
		
	}
	

	//매소드gs
	
	public String getschoolName() {
		return SchoolName;
	}


	public void setschoolName(String schoolName) {
		SchoolName = schoolName;
	}
	
	/////////////////////////////////
	public Student(String name, int age, String schoolName) {
		
		super(name, age); //person의 파라미터2개짜리 생성자 실행 
		
		this.SchoolName=schoolName;
	}
	/////////////////////////////////

	
	//매소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + SchoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("==========================");
		System.out.println("이름"+ name);
		System.out.println("나이"+ super.getAge);
		System.out.println("학교"+this.schoolName);	
		System.out.println("==========================");
		
	}
	
}

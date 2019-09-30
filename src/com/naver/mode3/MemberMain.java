package com.naver.mode3;

public class MemberMain {

	public static void main(String[] args) {
	
		Member.age = 20; //static으로 지정되었으므로 클래스 변수로 됨
		// 클래스명.변수명
		Member.info(); // static으로 지정되었으므로 클래스 메서드로 됨 
		// 클래스명.메서드명();
	}

}

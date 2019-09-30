package com.naver.mode3;

public final class Member {
	/*
	public final int AGE;
	//final때문에 변수가 상수형 변수로 바뀜
	//상수형 변수는 모두 대문자로 쓴다. 
	*/
	
	public static int age; //클래스변수는 객체 이미 만들어짐 객체 안만들어도 사용가능
	public String name; //멤버변수 객체만들어야 사용가능
	
	//멤버메서드, 인스턴스메서드 : 객체필요 객체만들어야 사용가능
	public void instanceMethod() {
		System.out.println(name); // 나중에 
		System.out.println(age); // 이미 객체만들어졌으므로 사용가능
		info(); //이미 객체 만들어졌으므로 사용가능 
	}
	
	//클래스메서드 "static" : 객체필요X 언제든지 사용가능
	public static void info() {	
		System.out.println(age);
		//System.out.println(name); //에러 : 객체만들어야 사용가능 객체안만들었으므로 사용불가
		//instanceMethod(); //에러 : 객체 만들어야 사용가능 객체안만들었으므로 사용불가
		//둘 다 객체를 만들면 사용가능
	}

}

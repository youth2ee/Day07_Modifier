package com.naver.mode1;

public class Member {

	private int age; //다른 패키지에서 쓰기위해서는 앞에 public 써줘야 한다.
	String name; //앞에 아무것도 없다는 것은 default가 있다는 것으로. 같은 패키지 안에서만 사용가능
	private double ki; //같은 클래스 내에서만 사용가능

	//디폴트 생성자
	public Member(){}

	public Member(String name, int age, double ki) {
		this.name =name;
		this.age =age;
		this.ki =ki;
	}

	public void setage(int age) {
		if(age>=0 && age<150) {
			this.age = age;
		}else {
			this.age = 10;
		}
	}

	public void setki(double ki) {
		this.ki = ki;
	}
	
	public double getki() {
		return this.ki;
	}

	public void info() {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.ki);
	}
	
	
}

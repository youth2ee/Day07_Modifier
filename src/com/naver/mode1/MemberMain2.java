package com.naver.mode1;

public class MemberMain2 {

	public static void main(String[] args) {
		Member member = new Member();
		//member.age =10;
		member.name="이지윤";
		// member.ki=180; //ki는 private가 붙었으므로 Member 클래스 내에서만 사용이 가능 

		double k = 180.2;
		member = new Member("이가영", 30, 183.5);
		member.setki(175.3);
		
		member.info();
		
		System.out.println(member.getki());
		
	}

}

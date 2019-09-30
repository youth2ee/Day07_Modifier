package com.naver.mode2;

import com.naver.mode1.Member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member = new Member();
		// member.age=28; //패키지 mode1에서 int age 앞에 public을 붙이면 가능 private면 불가능
		// member.name="이가영"; 패키지 mode1에서 String name앞에 아무것도 안붙으면 default값이 붙은것과
		//같으므로 다른 패키지인 여기서는 사용이 불가능.
		
		//member.info();
		
	}

}

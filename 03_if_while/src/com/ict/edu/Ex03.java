package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 if 문 : if문을 여러개 사용한 문
		// 형식 ) if(조건식1){
		// 조건식1이 참일 때 실행문장;
		// }else if( 조건식2)
		// 조건식1이 거짓이고, 조건식이2가 참인 경우 실행문장;
		// }else if( 조건식3)
		// 조건식1,2이 거짓이고, 조건식이3가 참인 경우 실행문장;
		// }else{
		// 조건식 1,2,3 모두 거짓일 때 즉, 나머지
		// }

		// int k1 점수 90이상 A, 80이상 B, 70이상 C, 나머지 F
		int k1 = 75;
		String score = "";
		if (k1 >= 90) {
			score = "A";
		} else if (k1 >= 80) {
			score = "B";
		} else if (k1 >= 70) {
			score = "C";
		} else {
			score = "F";
		}
			System.out.println("점수 : " + score);
			
		// char k2가 대문자인지, 소문자인지,숫자인지 기타문자인지 판별
		char k2 = 'Q';
		String res = "";
		if (k2 >= 'A' && k2 <= 'Z') {
			res = "대문자";
		} else if (k2 >= 'a' && k2 <= 'z') {
			res = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			res = "숫자";
		} else {
			res = "기타문자";
		}
		System.out.println(res);
		
		// char k3 A,a- 아프리카 B,b - 브라질, C,c-캐나다 ,나머지 한국
		char k3 = 'c';
		res = "";

		if (k3 == 'A' || k3 == 'a') {
			res = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			res = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			res = "캐나다";
		} else {
			res = "한국";
		}
		System.out.println(res);
		
		// menu가 1이면 카페모카 3500,2이면 카페라떼 4000, 3이면 아메리카노 3000
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가?
		// (부가세10%포함)

		int menu = 3;
		int insert = 10000;
		int serv = 2;
		int won = 0;
		double vat = 1.1;


				if (menu == 1) {
			won = insert - (int)((3500 * serv)*vat);

		} else if (menu == 2) {
			won = insert - (int)((4000 * serv)*vat);

		} else if (menu == 3) {
			won = insert - (int)((3000 * serv)*vat);

		} else {
			won = insert - (int)((3500 * serv)*vat);

		}
		System.out.println("잔돈 : " + won + "원");
		
		// menu가 1이면 카페모카 3500,2이면 카페라떼 4000, 3이면 아메리카노 3000
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가?
		// (부가세10%포함)

		int menu1 = 3;

				if (menu1 == 1) {
					int dan = 3500;
					String drink = "카페모카";
					int su = 2;
					int total = dan * su;
					int vat1 = (int)(total * 0.1);
					int input = 10000;
					int output = input - (total + vat1);
					System.out.println("잔돈 : " + output + "원");
					
		} else if (menu1 == 2) {
			int dan = 4000;
			String drink = "카페라떼";
			int su = 2;
			int total = dan * su;
			int vat1 = (int)(total *0.1);
			int input = 10000;
			int output = input - (total + vat1);
			System.out.println("잔돈 : " + output + "원");
			
		} else if (menu1 == 3) {
			int dan = 3000;
			String drink = "아메리카노";
			int su = 2;
			int total = dan * su;
			int vat1 = (int)(total *0.1);
			int input = 10000;
			int output = input - (total + vat1);
			System.out.println("잔돈 : " + output + "원");

			
		} else {
			int dan = 3500;
			String drink = "과일쥬스";
			int su = 2;
			int total = dan * su;
			int vat1 = (int)(total *0.1);
			int input = 10000;
			int output = input - (total + vat1);
			System.out.println("잔돈 : " + output + "원");
	}

				System.out.println("-----리팩토링 : 1. 중복코딩을 줄이자");		

				int dan2 = 0;
				String drink2 ="";
				
				if (menu==1) {
					 dan2 = 3500;
					 drink2 ="카페모카";
				} else if (menu==2) {
					 dan2 = 4000;
					 drink2 ="카페라떼";	
				} else if (menu==3) {
					 dan2 = 3000;
					 drink2 ="아메리카노";	
				} else if (menu==4) {
					 dan2 = 3500;
					 drink2 ="과일쥬스";	
				}
				int su2 = 2;
				int total2 = dan2 * su2;
				int vat2 = (int)(total2 *0.1);
				int input2 = 10000;
				int output2 = input2 - (total2 + vat2);
				System.out.println("잔돈 : " + output2 + "원");
	}
}

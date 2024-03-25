package chap02;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.print("두 정수 입력 : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int total = a + b;

		// 1. 단일 if문

//		 if (total >= 90) System.out.println("good"); //단일문 중괄호 생략 가능

		// 2. if - else

//		if (total >= 90) {
//			System.out.println("점수 : " + total + ", good"); // 단일문 중괄호생략 가능
//		} else {
//			System.out.println("점수 : " + total + ", bad");
//		}
		
		// 3. if - else if

//		if (total >= 90) {
//			System.out.println("점수 : " + total + ", A"); // 단일문 중괄호 생략 가능
//		} else if (total >= 80) {
//			System.out.println("점수 : " + total + ", B");
//		} else if (total >= 70) {
//			System.out.println("점수 : " + total + ", C");
//		} else {
//			System.out.println("점수 : " + total + ", F");
//		}

		// 4. 중첩 if
		// 놀이동산 매표 가격
		// 시간 : 주간권(16:00이하), 야간권(16:00초과)
		// 나이 : 대인 (소인과 노인 외), 소인과 노인(소인 7세 이하, 노인 65세 이상)
		// 가격 : 주간&대인 2000, 주간&노소인 10000, 야간&대인 15000, 야간&노소인 5000

		System.out.print("시간(0~24시) : ");
		int time = scan.nextInt();
		System.out.print("나이(3~100세) : ");
		int age = scan.nextInt();
		
		int price;
		
		if (time <= 16) {
			if (age <=7 || age >=65) {
				price = 10000;			//주간&(소인|노인)
			} else {
				price = 20000;			//주간&대인
			}
		} else {
			if (age <=7 || age >=65) {
				price = 5000;			//야간&(소인|노인)
			} else {
				price = 15000;			//야간&대인
			}
		}
		System.out.println("표 가격 : " + price);
		
		scan.close();
	}

}

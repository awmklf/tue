package chap02;

import java.util.Scanner;

public class SwitchTOIfEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 커피 주문에 따른 가격 출력 프로그램
		// 아메리카노 : 5000, 카푸치노 : 7000, 카페라떼 : 8000, 그 외 : 0

		System.out.println("커피 종류(아메리카노, 카푸치노, 카페라떼) : ");
		String order = scan.next();
		int price;

		if (order.equals("아메리카노")) {
			price = 5000;
		} else if (order.equals("카푸치노") || order.equals("카페라떼")) {
			price = 7000;
		} else {
			price = 0;
		}

		System.out.println("주문한 커피는 " + order + "이며, 가격은 " + price + "입니다.");

		scan.close();
	}

}

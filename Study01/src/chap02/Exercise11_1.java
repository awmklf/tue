package chap02;

import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12)>>");
		int month = s.nextInt();

		if (1 <= month && month <= 12) {
			if (3 <= month && month <= 5) {
				System.out.println("봄");
			} else if (6 <= month && month <= 8) {
				System.out.println("여름");
			} else if (9 <= month && month <= 11) {
				System.out.println("가을");
			} else {
				System.out.println("겨울");
			}
		} else {
			System.out.println("잘못입력");
		}

		s.close();
	}

}

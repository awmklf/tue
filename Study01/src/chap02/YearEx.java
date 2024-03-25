package chap02;

import java.util.Scanner;

public class YearEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력 :");
		int year = scan.nextInt();

		// 1. 조건연산자로 윤년, 평년 구분 (윤년 result 1, 평년 result 0)
		boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? true : false;

		// 2. if문으로 윤년, 평년 출력

		if (result) {
			System.out.println(year + "은 윤년");
		} else {
			System.out.println(year + "은 평년");
		}

		// 3. switch 문으로 월의 일수 체크
		// month 2 윤년 : 29, 평년 : 28
		// 4, 6, 9, 11 : 30
		// 외 : 31

		System.out.println("월 입력 :");
		int month = scan.nextInt();

		int days;

		switch (month) {
		case 2:
			if (result) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}

		System.out.println("switch문 - " + month + "월의 일수 : " + days + "일");

		// 4. if-else 문으로 월의 일수 체크
		if (month == 2) {
			if (result) {
				days = 29;
			} else {
				days = 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 31;
		}
		System.out.println("if-else문 - " + month + "월의 일수 : " + days + "일");

		scan.close();
	}
}

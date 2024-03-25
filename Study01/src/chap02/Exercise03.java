package chap02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("금액 입력>> ");
		int num = scan.nextInt();

		if (num >= 50000) {
			System.out.println("오만원권 " + num / 50000);
			num %= 50000;
		}
		if (num >= 10000) {
			System.out.println("만원권 " + num / 10000);
			num %= 10000;
		}
		if (num >= 5000) {
			System.out.println("오천원권 " + num / 5000);
			num %= 5000;
		}
		if (num >= 1000) {
			System.out.println("천원권 " + num / 1000);
			num %= 1000;
		}
		if (num >= 500) {
			System.out.println("오백원 " + num / 500);
			num %= 500;
		}
		if (num >= 100) {
			System.out.println("백원 " + num / 100);
			num %= 100;
		}
		if (num >= 50) {
			System.out.println("오십원 " + num / 50);
			num %= 50;
		}
		if (num >= 10) {
			System.out.println("십원 " + num / 10);
			num %= 10;
		}
		if (num >= 1) {
			System.out.println("일원 " + num);
		}

		scan.close();
	}

}

package chap02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력(1~99)>> ");
		int num = scan.nextInt();

		if (num >= 1 && num <= 99) {
			int a = num / 10; //10의 자리수
			int b = num % 10; //1의 자리수
			boolean mul1 = a != 0 && a % 3 == 0 ? true : false; //10의 자리수 3,6,9조건문
			boolean mul2 = b != 0 && b % 3 == 0 ? true : false; //1의 자리수 3,6,9조건문
			
			if (mul1 && mul2) {
				System.out.println("박수짝짝");
			} else if (mul1 || mul2) {
				System.out.println("박수짝");
			} else	System.out.println("X");

		} else	System.out.println("1~99사이의 정수만 입력 가능합니다.");

		scan.close();
	}
}

package chap02;

import java.util.Scanner;

public class Exercise12_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("연산>>");
		double a = s.nextDouble();
		String op = s.next();
		double b = s.nextDouble();
		
		if (op.equals("+")) {
			System.out.println(a + op + b + "의 계산 결과는 " + (a + b));
		} else if (op.equals("-")) {
			System.out.println(a + op + b + "의 계산 결과는 " + (a - b));
		} else if (op.equals("*")) {
			System.out.println(a + op + b + "의 계산 결과는 " + (a * b));
		} else if (op.equals("/")) {
			if (b!=0) {
				System.out.println(a + op + b + "의 계산 결과는 " + (a / b));
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		} else {
			System.out.println("잘못된 연산자입니다.");
		}

		s.close();
	}

}

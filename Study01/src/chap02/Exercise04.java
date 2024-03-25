package chap02;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 3개 입력>> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println("중간 값은 " + num2);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println("중간 값은 " + num1);
		} else if (num1 < num3 && num3 < num2) {
			System.out.println("중간 값은 " + num3);
		} else {
			System.out.println("입력한 정수 중 같은 수가 있어 중간 크기의 값을 비교할 수 없습니다.");
		}
		
		scan.close();
	}
}

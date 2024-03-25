package chap02;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// 정수 3개를 입력받고 3개의 수로 삼각형를 만들 수 있는지 판별 *두 변의 합이 다른 한 변의 길이보다 커야함

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a + b < c || a + c < b || b + c < a) {
			System.out.println("삼각형이 됩지 못합니다.");
		} else {
			System.out.println("삼각형이 됩니다.");
		}
		
		scan.close();
	}

}

package chap03;

import java.util.Scanner;

public class Continue_Break_Ex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = 0, sum = 0;

		//1. continue 예제
		//정수 입력을 5회 받아 합계 출력(음수입력은 무시)
		for (int i = 1; i < 5; i++) {
			System.out.println("정수 입력:");
			num = s.nextInt();
			if (num < 0) {
				i--;
				continue;
			}
			sum += num;
		}
		System.out.println("합계: " + sum);

		
		//2. break 예제
		while (true) {
			System.out.println(">>");
			String text = s.nextLine();
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("종료합니다.");
		
		s.close();
	}

}

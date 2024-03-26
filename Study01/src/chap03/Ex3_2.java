package chap03;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {

		int count = 0;
		int sum = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		int num = s.nextInt();

		while (num != -1) {
			num = s.nextInt();
			sum += num;
			count++;
		}
		if (count == 0) {
			System.out.println("입력된 정수가 없습니다.");
		} else {
			System.out.println("정수의 개수는 " + count + "개이며 평균은 " + (double) sum / count + "입니다.");
		}

		s.close();
	}
}

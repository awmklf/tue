package chap02;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int r1 = s.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		int r2 = s.nextInt();

		boolean cirx = (x1 + r1) >= (x2 - r2) && (x1 - r1) <= (x2 + r2) ? true : false;
		boolean ciry = (y1 + r1) >= (y2 - r2) && (y1 - r1) <= (y2 + r2) ? true : false;

		if (cirx && ciry) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 겹치지 않는다.");
		}

		s.close();
	}

}

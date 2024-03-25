package chap02;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("원의 중심좌표 (x,y)를 입력>> ");
		double cirx = scan.nextDouble();
		double ciry = scan.nextDouble();
		System.out.print("원의 반지름 입력>> ");
		double r = scan.nextDouble();
		System.out.print("점 (x,y)의 좌표를 입력>> ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		if ((cirx - r) < x && x < (cirx + r) && (ciry - r) < y && y < (ciry + r)) {
			System.out.println("(" + x + "," + y + ")는 원 안에 있다.");
		} else {
			System.out.println("(" + x + "," + y + ")는 원 밖에 있다.");
		}

		scan.close();
	}

}

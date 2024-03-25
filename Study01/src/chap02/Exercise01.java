package chap02;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		final double rate = 1100;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = scanner.nextInt();
		double dollar = (double)won / rate;
		
		System.out.printf(won + "원은 $" + "%.1f" + "입니다.", dollar);
		
		scanner.close();
	}

}

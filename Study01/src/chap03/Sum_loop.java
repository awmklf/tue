package chap03;

import java.util.Scanner;

//1~10까지의 수를 합산하는 코드 작성

public class Sum_loop {

	public static void main(String[] args) {
		int num = 1, sum = 0;

//		// 1. while문 작성
//		System.out.println("while문");
//		while (num <= 10) {
//			sum += num;
//			System.out.print(num);
//			if (num < 10) {
//				System.out.print(" + ");
//			} else {
//				System.out.println(" = " + sum);
//				break;
//			}
//			num++;
//		}
//
//		sum = 0;
//
//		// 2. for문 작성
//		System.out.println("for문");
//		for (int num1 = 1; num1 <= 10; num1++) {
//			sum += num1;
//			System.out.print(num1);
//			if (num1<=9) {
//				System.out.print(" + ");
//			}else {
//				System.out.println(" = " + sum);
//			}
//
//		}
//
//		// 3. for문 : sum >= 1000인 순간의 sum 출력
//		for (int num = 1; num <= 100; num++) {
//			if (sum >= 1000) {
//				break;
//			}
//			sum += num;
//		}
//		System.out.println(sum);
//
//		// 4. for문 : 1~100사이를 합산하되 3의 배수는 제외하고 합산
//		for (int num = 1; num <= 100; num++) {
//			if (num % 3 == 0) {
//				System.out.println(num + ": 3의 배수이므로 패스");
//				continue;
//			}
//			sum += num;
//		}
//		System.out.println(sum);
//		
//		// 5. do-while문 : 1~100사이를 합산하되 3의 배수는 제외하고 합산
//		num = 0;
//		do {
//			num++;
//			if (num % 3 == 0) {
//				System.out.println(num + ": 3의 배수이므로 패스");
//				continue;
//			}
//			sum += num;
//
//		} while (num <= 100);
//		System.out.println(sum);
		
		//6. 사용자에게 정수를 입력받되 -1을 입력할 때까지 합산하여 결과를 출력해주세요.
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("정수입력:");
			num = s.nextInt();
			if (num == -1) {
				break;
			}
			sum += num;
		}
		System.out.println("sum: " + sum);
		s.close();
	}
}

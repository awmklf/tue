package chap03;

import java.util.Scanner;

// 1to 100 게임 : 컴퓨터는 1~100 랜덤 수를 생성, 사용자가 이를 맞추는 게임

public class Game_1to100 {

	public static void main(String[] args) {
		int com = 1 + (int) (Math.random() * 100); // 1~100 사이의 랜덤 수
		Scanner scan = new Scanner(System.in);
		int user = 0;
		int count = 1;
		boolean state = false;

		while (true) {
			if (count > 5) {
				break;
			}
			System.out.print(count + "회 사용자값 입력(1~100) : ");
			user = scan.nextInt();

			if (user == com) {
				state = true;
				break;
			} else if (user > com) {
				System.out.println("사용자의 입력 숫자가 더 높습니다.");
			} else {
				System.out.println("사용자의 입력 숫자가 더 낮습니다.");
			}
			count++;
		}

		if (state) {
			System.out.print("성공, 게임종료");
		} else {
			System.out.println("실패, 게임종료 (사용자:" + user + " 컴퓨터:" + com + ")");
		}
		scan.close();
	}
}

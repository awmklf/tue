package chap02;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("점 (x1,y1)의 좌표를 입력>> ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		System.out.print("점 (x2,y2)의 좌표를 입력>> ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		boolean p1 = inRect(x1, y1, 100, 100, 200, 200);
		boolean p2 = inRect(x1, y2, 100, 100, 200, 200);
		boolean p3 = inRect(x2, y1, 100, 100, 200, 200);
		boolean p4 = inRect(x2, y2, 100, 100, 200, 200);
		
		if ( p1 || p2 || p3 || p4) {
			System.out.println("(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")는 사각형과 충돌합니다.");
		} else {
			System.out.println("(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")는 사각형과 충돌하지 않습니다.");
		}
		
		scan.close();

	}

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		} else
			return false;
	}

}

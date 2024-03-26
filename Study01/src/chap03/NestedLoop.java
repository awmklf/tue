package chap03;

public class NestedLoop {

	public static void main(String[] args) {

		// 1. 5*5 별 찍기
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===========================");
		// 2. 삼각형 별찍기
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===========================");
		// 3. 역삼각형 별찍기
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 6 - row; col++) {
				System.out.print("*");
			}
			for (int col2 = 1; col2 <= row; col2++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("===========================");
		// 4. 오른쪽 삼각형 별찍기
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 6 - row; col++) {
				System.out.print(" ");
			}
			for (int col2 = 1; col2 <= row; col2++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===========================");
		// 5. 피라미드 별찍기
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 6 - row; col++) {
				System.out.print(" ");
			}
			for (int col2 = 1; col2 <= (row * 2 - 1); col2++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===========================");
		// 6. 구구단 찍기
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				System.out.print(row + "*" + col + "=" + row * col + "\t");
			}
			System.out.println("");
		}

	}
}

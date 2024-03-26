package chap03;


public class Lotto {

	public static void main(String[] args) {

		// 1. 배열 선언
		int lotto[] = new int[7];

		// 2. 배열 값 입력 (1~45랜덤수)
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 1 + (int) (Math.random() * 45);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 3. 배열 값 출
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}

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
		System.out.println("");
		
		// 4. 로또 값 중 최대값 및 최대값의 인덱스 출력
		int max = lotto[0];
		int max_idx = 0;
		for (int i = 1; i < lotto.length; i++) {
			if (max < lotto[i]) {
				max = lotto[i];
				max_idx = i;
			}
		}
		System.out.println("max: " + max + " max_index: " + max_idx);
	}

}

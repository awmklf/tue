package chap02;

public class OperatorEx {

	//산술 : +-*/%
	public static void arithmetic() {
		final int time = 482;
		int min = time/60;
		int sec = time%60;
		System.out.println(min + "분" + sec + "초");
	}
	//증감,대입
	public static void increament() {
		int a = 10;
		int b = 20;
		int c = 30;
		c = --a - --b;
		System.out.println("c: " + c);
	}
	//논리,비교
	public static void logical() {
		// 비교
		int a = 10, b = 20;
		boolean result;
		result = a==b;
		result = a!=b;
		System.out.println(result);
		
		//논리
		boolean b1 = true;
		boolean b2 = false;
		boolean result1;
		result1 = b1 && b2;
		System.out.println(result1);
	}
	//조건
	public static void ternary() {
		int a = 10, b = 20;
		int max;
		max = a > b ? a : b;
		System.out.println(a + "과 " + b + " 중 큰 값은? " +max);
	}
	//비트
	public static void bitop() {
		int a = 10;
		int result = a >> 1;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		//arithmetic();
		//increament();
		//logical();
		//ternary();
		bitop();
		
		
		
	}

}

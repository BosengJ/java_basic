package garam;

public class _09_CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstMethod() {
		System.out.println("firstMathod()이 시작되었음.");
		secondMethod();
		System.out.println("firstMathod()이 끝났음.");
	}
	
	static void secondMethod() {
		System.out.println("secondMathod()이 시작되었음.");
		System.out.println("secondMathod()이 끝났음.");
	}
}

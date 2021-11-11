package garam;

public class _09_ReturnTest {
	public static void main(String[] args) {
		_09_ReturnTest r = new _09_ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]);
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}

}

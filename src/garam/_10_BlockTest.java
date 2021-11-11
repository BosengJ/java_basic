package garam;

public class _10_BlockTest {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	
	public _10_BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		_10_BlockTest bt = new _10_BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		_10_BlockTest bt2 = new _10_BlockTest();
	}

}

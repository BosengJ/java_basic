package garam;

public class _10_MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	
	static int cv2 = new _10_MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
		_10_MemberCall c = new _10_MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		_10_MemberCall c = new _10_MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}

}

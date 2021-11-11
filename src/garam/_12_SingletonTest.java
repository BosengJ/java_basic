package garam;

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();
		return s;
	}
}

public class _12_SingletonTest {
	public static void main(String args[]) {
		Singleton s = Singleton.getInstance();
	}

}

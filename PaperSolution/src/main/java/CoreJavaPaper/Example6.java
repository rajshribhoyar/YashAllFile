package CoreJavaPaper;

public class Example6 {
	
	static int num=1;
	
	static {
		num=2;	
	}
	static {
		num=3;
		
	}
	public static void display() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		display();
	}

}

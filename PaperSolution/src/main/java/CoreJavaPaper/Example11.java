package CoreJavaPaper;

public class Example11 {
	public int method1() {
		return 20;
		
	}

}
class B extends Example11{
	public int method1() {
		return 30;
	}
	public int method2() {
		return 40;
		
	}
}
class C extends B{
	public int method2() {
		return 20;
		
	}
}

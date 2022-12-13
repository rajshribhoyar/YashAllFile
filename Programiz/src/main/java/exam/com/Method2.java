package exam.com;

public class Method2 {
	public void display1() {
		System.out.println("Method without Parameter");
	}
	public void display2(int a) {
		System.out.println("Method with singal Parameter:" +a);
		
	}
	public static void main(String[] args) {
		
		Method2 mm=new Method2();
		
		mm.display1();
		mm.display2(22);
	}

}

package exam.com;

public class Method {

	public static int square(int num) {
		return num * num;

	}

	public static void main(String[] args) {

		//Method MM = new Method();  // That using staic keyword - don't need to create object;
		int result;
		result = square(20);
		System.out.println("Square value of 20 is: " + result);
	}

}

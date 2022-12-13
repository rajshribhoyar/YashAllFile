package exam.com;

class Lamp {

	boolean inOn;

	void turnOn() {
		inOn = true;
		System.out.println("Light On: " + inOn);

	}

	void turnOff() {
		inOn = false;
		System.out.println("Light Off: " + inOn);
	}
}

public class ClassObject {
	public static void main(String[] args) {
		Lamp LL = new Lamp();

		LL.turnOn();
		LL.turnOff();

	}

}
package ap.car;

public class CarRunner {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car("Ford", "x50", "Silver", true, 60);
		
		myCar.setSpeed(50);
		boolean cc = myCar.isCruiseControl();
	}

}
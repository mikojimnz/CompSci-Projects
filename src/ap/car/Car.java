package ap.car;

public class Car {
	// instance variables
	private String make, model, color;
	private boolean cruiseControl;
	private int speed;

	public Car() {
		make = "";
		model = "";
		color = "";
		cruiseControl = false;
		speed = 0;

	}

	public Car(String make, String model, String color, boolean cruiseControl, int speed) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.cruiseControl = cruiseControl;
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCruiseControl() {
		return cruiseControl;
	}

	public void setCruiseControl(boolean cruiseControl) {
		if (speed > 20 && speed < 75) {
			this.cruiseControl = cruiseControl;
		} else {
			this.cruiseControl = false;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
package ap.slides.searches24;

public class Dog {
	private String name;
	private int weight;
	
	public Dog() {
		name = "";
		weight = 0;
	}
	
	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public int compareTo(Dog other) {
		if (name.equals(other.name) && weight == other.weight) {
			return 0;
		}
		
		if (name.equals(other.name) && weight < other.weight) {
			return -1;
		}
		
		if (name.equals(other.name) && weight > other.weight) {
			return 1;
		}
		
		return name.compareTo(other.name);
	}
}

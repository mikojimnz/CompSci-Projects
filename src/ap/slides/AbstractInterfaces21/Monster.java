package ap.slides.AbstractInterfaces21;
//(c) A+ Computer Science

public abstract class Monster {
	protected String name;

	public Monster() {
		name = "";
	}

	public Monster(String nm) {
		name = nm;
	}

	public String getName() {
		return name;
	}

	public abstract String talk();

	public String toString() {
		return name + "  says  " + talk();
	}
}

package ap.slides.AbstractInterfaces21;
//(c) A+ Computer Science

// www.apluscompsci.com

//abstract example one 

public class Vampire extends Monster {
	public Vampire(String name) {
		super(name);
	}

	public String talk() {
		return name + " \"I want to drink your blood!\"\n\n";
	}
}

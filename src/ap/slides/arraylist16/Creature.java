package ap.slides.arraylist16;

public class Creature {
	private int size;
	private String type;
	
	public Creature (int s, String t) {
		size = s;
		type = t;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isBig() {
		if (size > 25) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Size = " + size + " Type = " + type + "\n";
		
	}
}

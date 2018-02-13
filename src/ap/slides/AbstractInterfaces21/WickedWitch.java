package ap.slides.AbstractInterfaces21;

public class WickedWitch extends Witch {
	
	public WickedWitch(String name) {
		super(name);
	}
	
	@Override
	public String talk() {
		return "\" am the mean witch!\"\n\n";
	}

}

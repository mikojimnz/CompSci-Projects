package ap.slides.searches24;

public class test {

	public static void main(String[] args) {
		String word1 = "a", word2 = "a";
		
		System.out.println(word1.compareTo(word2));
		
		Dog d0 = new Dog("d0", 10);
		Dog d1 = new Dog("d1", 100);
		Dog d2 = new Dog("d2", 1000);
		Dog d3 = new Dog("d2", 100);
		
		System.out.println(d0.compareTo(d1));
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d3));
	}

}
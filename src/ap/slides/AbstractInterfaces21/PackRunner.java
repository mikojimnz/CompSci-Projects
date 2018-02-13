package ap.slides.AbstractInterfaces21;
//(c) A+ Computer Science

// www.apluscompsci.com

//Pack Runner Example
import static java.lang.System.out;

public class PackRunner {
	public static void main(String[] args) {
		MonsterPack pack = new MonsterPack();
		pack.loadMonsters();
		out.print(pack.monstersTalk());
		out.println(pack);
	}
}
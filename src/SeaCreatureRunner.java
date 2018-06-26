
public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature s1 = new SeaCreature("Spongebob");
		s1.eat();
		s1.laugh();
		SeaCreature s2 = new SeaCreature("Patrick");
		SeaCreature s3 = new SeaCreature("Squidward");
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		s2.eat();
		s3.eat();
		s2.laugh();
		s3.laugh();
	}

}


public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */

		// 1. Create a RaceCar and place it in 5th position
		RaceCar Porsche = new RaceCar("Porsche", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println(Porsche.getPositionInRace());
		// 3. Crash the RaceCar
		Porsche.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (Porsche.isDamaged()) {
			Porsche.pit();
		}
		// 5. Help the car move into first place.
		for (int i = 0; i < 7; i++) {
Porsche.overtake();
System.out.println(Porsche.getPositionInRace());
		}

	}
}

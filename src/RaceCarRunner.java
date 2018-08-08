

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar ryan = new RaceCar("Lambo", 5);
		// 2. Print the RaceCar's position in the race
		ryan.getPositionInRace();
		// 3. Crash the RaceCar
		ryan.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (ryan.damaged = true) {
			ryan.pit();
		}
		// 5. Help the car move into first place.
		int pos = ryan.getPositionInRace();
		for (int i = 0; i < pos; i++) {
			ryan.overtake();
		}
	}
}

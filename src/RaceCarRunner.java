


public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar Ryan = new RaceCar("Gavin", 5);
		// 2. Print the RaceCar's position in the race
	System.out.println(Ryan.getPositionInRace());
		// 3. Crash the RaceCar
		Ryan.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(Ryan.isDamaged()) {
			Ryan.pit();
		}
		
		// 5. Help the car move into first place.
		for (int i = Ryan.getPositionInRace(); i > 1; i--) {
			Ryan.overtake();
		}
	}
}

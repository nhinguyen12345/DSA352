import java.util.ArrayList;
import java.util.Random;
import java.util.LinkedList;

public class ContestDriver {
	// Flip a coin to determine if the answer is correct
	public static boolean flipCoin() {
		Random rand = new Random();
		return rand.nextInt(2) == 1; // true for heads, false for tails
	}
	// Simulate one round of the contest
    public static void simulateRound( LinkedList<Contestant> contestants) {
        for (int i = 0; i < contestants.size(); i++) {
            boolean correctAnswer = flipCoin();
            Contestant contestant = contestants.get(i);

            if (correctAnswer) {
                // Correct answer: Move to the front
                contestants.add(0, contestants.remove(i));
            } else {
                // Incorrect answer: Move to the back
                contestants.add(contestants.remove(i));
            }
            // Update contestant's position after each round
            contestant.setPosition(i);
        }
    }
	public static void main(String[] args) {
		System.out.println("Starting Simulation");

		// Step -1 Compile the program as is to be sure it runs

		// Step 0 - Uncomment the two lines below, then add code to the Contestant class to make this compile
		// This creates a single Contestant and prints its attributes, just to show it can be done
		//Contestant ac = new Contestant("Billy",22);
		//System.out.println(ac);
		
		// Step 2
		// Create multiple Contestants and add them to an ArrayList
		//ArrayList<Contestant> contestants = new ArrayList<>();
		// Change from ArrayList to LinkedList
		LinkedList<Contestant> contestants = new LinkedList<>();
        int n = 45000; // Number of contestants
		int rounds = 1000;
		// Do something simple to get started, but remember, you will need
		// to generate up to 1,000,000 Contestants	
		// Generate multiple contestants with names 0, 1, 2, ..., n-1
        for (int i = 0; i < n; i++) {
            Contestant con = new Contestant(String.valueOf(i), 18);
            contestants.add(con);
        }

		
		// Steps 3 and 4
		
		// Play a round
		simulateRound(contestants);
		
		// For each Contestant, flip a coin, then move the Contestant to
		// one end of the ArrayList or the other.
		
		
		// Steps 5 - 7
		long startTime = System.nanoTime(); // Start time

        for (int round = 1; round <= rounds; round++) {
            simulateRound(contestants);
        }
		long endTime = System.nanoTime(); // End time
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken (in nanoseconds): " + elapsedTime);
		// Repeat Steps 3 and 4 many times to gather data.
		// You will need to modify the Contestant class so each Contestant
		// will keep track of its individual statistics. Be smart about how you record its
		// position at the end of each round.
		System.out.println("Finished");
		// Print average positions after all rounds
        //System.out.println("\nAverage positions after " + rounds + " rounds:");
       // for (Contestant c : contestants) {
            //System.out.println(c.getName() + ": " + c.getAveragePosition());
        //}

        System.out.println("Finished");
    }
}
	



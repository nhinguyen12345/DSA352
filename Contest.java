import java.util.ArrayList;
import java.util.Random;

class Person{
protected String name;

    // Constructor to initialize the name
    public Person(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }
}
class Contestant extends Person{
    private int position;
    private int totalPosition; // To store cumulative position values
    private int roundsPlayed; // To track the number of rounds the contestant has participated in

    // Constructor to initialize the name using the superclass constructor and position.
    public Contestant(String name) {
        super(name);
        this.position = 0;
        this.totalPosition = 0;
        this.roundsPlayed = 0;
    }
    //Getter for podition
    public int getPosition() {
        return position;
    }
    // Setter for position
    public void setPosition(int position) {
        this.position = position;
        this.totalPosition += position; // Add current position to total
        this.roundsPlayed++; // Increment rounds played
    }
    // Calculate average position
    public double getAveragePosition() {
        double avg = 0;
        return avg = (double) totalPosition / roundsPlayed;
    }
    public void resetPosition() {
        this.position = 0;
    }
}
public class Contest {
    
    public static boolean flipCoin() {
        // Create a Random object to generate random values
        Random rand = new Random();
            
        // Generate a random number (0 or 1)
        int result = rand.nextInt(2); // nextInt(2) => 0 or 1
        
        // If the result is 0, return false (tails), otherwise return true (heads)
        return result == 0 ? false : true;
    }
    public static void simulateRound(ArrayList<Contestant> contestants) {
        // Iterate over the contestants and simulate answers
        for (int i = 0; i < contestants.size(); i++) {
            boolean correctAnswer = flipCoin(); // Flip coin to decide if the answer is correct
            Contestant contestant = contestants.get(i);

            if (correctAnswer) {
                // Correct answer: Move to the front of the line (move to position 0)
                contestants.add(0, contestants.remove(i)); // Remove and add to the front
            } else {
                // Incorrect answer: Move to the back of the line
                contestants.add(contestants.remove(i)); // Remove and add to the back
            }
            // Update contestant's position after each round

            contestant.setPosition(i); // Set current position in the list
        }
        }
    
    public static void main(String[] args) {
        int n = 45000; //add later?
        int rounds = 10000;
        ArrayList<Contestant> contestants = new ArrayList<>();

        // Create and add Contestant objects with names 0123...
        for (int name = 0; name < n; name++) { //I didn't know how to name 45000 people so I used ints
            Contestant con = new Contestant(String.valueOf(name));
            contestants.add(con);  // Add to the list
        }
        // Print initial positions
        System.out.println("Initial positions:");
        for (Contestant c : contestants) {
            System.out.print(c.getName() + " ");
        }
        System.out.println();
        // Simulate one round of the contest
        simulateRound(contestants);

        // Print final positions after one round
        System.out.println("\nPositions after one round:");
        for (Contestant c : contestants) {
            System.out.print(c.getName() + " ");
        }}}
        /* 
        long startTime = System.nanoTime();//start time
        // Run a series of rounds
        for (int round = 1; round <= rounds; round++) {
            //System.out.println("Round " + round + ":");
            simulateRound(contestants); // Simulate the round
            
            // Print positions after the round
            //for (Contestant c : contestants) {
                //System.out.print(c.getName() +  ":" + c.getPosition() + " ; ");
            //}
            //System.out.println();
        }
        long endTime = System.nanoTime();//end time
        long elapsedTime = endTime - startTime; // in nanoseconds
        System.out.println("\nTime took (in nanoseconds): " + elapsedTime);

        // After all rounds, print average positions of each contestant
        System.out.println("\nAverage positions after " + rounds + " rounds:");
        for (Contestant c : contestants) {
           System.out.println(c.getName() + ": " + c.getAveragePosition());
        }
    }
}*/



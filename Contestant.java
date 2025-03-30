/* Contestant.java:
 * This class extends Person while adding attributes and methods
 * related to recording performance in the specified contest.
 * 
 * Author: Hoang Nguyen
 * Last updated: [insert date]
 */

 public class Contestant extends Person {
    private int position;
    private int totalPosition; // To store cumulative position values
    private int roundsPlayed;  // To track the number of rounds played

    // Constructor using superclass constructor and initializing contest attributes
    public Contestant(String name, int age) {
        super(name, age);
        this.position = 0;
        this.totalPosition = 0;
        this.roundsPlayed = 0;
    }

    // Getter for position
    public int getPosition() {
        return position;
    }

    // Setter for position, updating totalPosition and roundsPlayed
    public void setPosition(int position) {
        this.position = position;
        this.totalPosition += position;
        this.roundsPlayed++;
    }

    // Calculate average position
    public double getAveragePosition() {
        if (roundsPlayed == 0) {
            return 0.0;
        }
        return (double) totalPosition / roundsPlayed;
    }

    @Override
    public String toString() {
        return "Contestant [name=" + getName() + ", age=" + getAge() + ", avgPosition=" + getAveragePosition() + "]";
    }
}

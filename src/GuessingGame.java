import java.util.Random;

public class GuessingGame {
    // Array to represent 3 cups
    private int[] cups;
    public Player player;
    private int ballCupIndex;

    public GuessingGame(Player mockPlayer) {
        // Three cups represented by integers as there are only 3 cups
        cups = new int[3];
        player = new Player();
        Random random = new Random();
        // Randomly put the ball under one of the cups
        ballCupIndex = random.nextInt(3);
        // Represent the cup with a ball with 1 (empty cups are 0)
        cups[ballCupIndex] = 1;
    }

    public void startGame() {
        // Displaying a welcome message
        System.out.println("Welcome to the Cup Guessing Game!");
        boolean correctGuess = false;

        while (!correctGuess) {
            int guess = player.makeGuess();
            if (isValidGuess(guess)) {
                // Minus 1 to align with 0-indexed array
                if (cups[guess - 1] == 1) {
                    System.out.println("Good Game!");
                    correctGuess = true;
                } else {
                    System.out.println("Game Over! Try again.");
                }
            } else {
                System.out.println("Invalid guess. Please enter 1, 2, or 3.");
            }
        }

        Report report = new Report(correctGuess);
        report.generateReport();
    }
    // checking if the guess is within 1 to 3
    public boolean isValidGuess(int guess) {
        return guess >= 1 && guess <= 3;
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    @Test
    void testIsValidGuess_ValidGuesses() {
        // creating a "computer" simulating user interaction
        Player cpuPlayer = new Player();
        GuessingGame game = new GuessingGame(cpuPlayer);

        // Test when the guess is valid
        assertTrue(game.isValidGuess(1), "Guess 1 is valid");
        assertTrue(game.isValidGuess(2), "Guess 2 is valid");
        assertTrue(game.isValidGuess(3), "Guess 3 is valid");
    }

    @Test
    void testIsValidGuess_InvalidGuesses() {
        // creating a "computer" simulating user interaction
        Player cpuPlayer = new Player();
        GuessingGame game = new GuessingGame(cpuPlayer);

        // Testing the invalid guesses
        assertFalse(game.isValidGuess(0), "Guess 0 is invalid");
        assertFalse(game.isValidGuess(4), "Guess 4 is invalid");
        assertFalse(game.isValidGuess(-109), "Guess -109 is invalid");
        assertFalse(game.isValidGuess(35), "Guess 35 is invalid");
    }
}

import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }
    //choosing the cup
    public class thankYou{
        public void BeginMessage(){
            System.out.println("Thank you for playing my game!");
        }
    }
    public int makeGuess() {
        System.out.print("Guess which cup (1, 2, or 3): ");
        return scanner.nextInt();
    }
}

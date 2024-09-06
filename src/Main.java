public class Main {
    public class thankYou{
        public void BeginMessage(){
            System.out.println("Thank you for playing my game!");
        }
    }
    public class Goodbye extends thankYou{
      public void EndMessage() {
          System.out.println("hope you had fun playing my game!");
        }
    }
    public static void main(String[] args) {
        //running the game
        GuessingGame game = new GuessingGame(mockPlayer);
        game.startGame();
    }
}
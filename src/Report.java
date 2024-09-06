public class Report {
    private boolean win;
    public Report(boolean win) {
        this.win = win;
    }
    //displaying the after game message
    public void generateReport() {
        if (win) {
            System.out.println("Congratulations! You found the ball.");
        } else {
            System.out.println("Game Over! Better luck next time.");
        }
    }
}
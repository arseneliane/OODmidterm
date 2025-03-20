import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        // Start the game loop
        while (playAgain) {
            System.out.println("Welcome to Tic-Tac-Toe!");
            
            // Start a new game
            Game game = new Game(scanner);
            game.play();

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (Y/N): ");
            String response = scanner.nextLine();

            playAgain = response.equalsIgnoreCase("Y");
            if (!playAgain) {
                System.out.println("Thanks for playing!");
            }
        }
        scanner.close();  // Close the scanner when done
    }
}

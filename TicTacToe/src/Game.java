import java.util.Scanner;

public class Game {
    private Grid grid;
    private Player player1;
    private Player player2;
    private Turn turn;
    private Result result;
    private Scanner scanner;

    public Game(Scanner scanner) {
        grid = new Grid();
        turn = new Turn();
        result = new Result();
        this.scanner = scanner;
    }

    private void setupPlayers() {
        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.nextLine();

        System.out.print("Choose your sign (X/O): ");
        char sign1 = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();  // Consume newline character

        char sign2 = (sign1 == 'X') ? 'O' : 'X';
        player1 = new Human(name1, sign1);

        System.out.print("Do you want to play against a human or computer? (H/C): ");
        char choice = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();  // Consume newline character

        if (choice == 'H') {
            System.out.print("Enter Player 2 name: ");
            String name2 = scanner.nextLine();
            player2 = new Human(name2, sign2);
        } else {
            System.out.print("Choose difficulty (E for Easy, H for Hard): ");
            char difficulty = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();  // Consume newline character

            boolean hardMode = (difficulty == 'H');
            player2 = new Computer(sign2, hardMode);
        }
    }

    public void play() {
        boolean playAgain = true;

        while (playAgain) {
            grid = new Grid();  // Reset the grid for the new game
            turn = new Turn();  // Reset the turn object
            result = new Result();  // Reset the result object

            setupPlayers();
            System.out.println("Starting a new game...");

            while (true) {
                grid.printGrid();  // Display the board
                Player currentPlayer = turn.isPlayerOneTurn() ? player1 : player2;
                currentPlayer.playTurn(grid);  // Player makes their move

                char winner = grid.checkWinner();  // Check if there's a winner
                if (winner != ' ') {
                    result.setWinner(winner);
                    break;  // End the game if there's a winner
                }

                if (grid.isBoardFull()) {  // If the board is full and no winner, it's a draw
                    result.setWinner(' ');
                    break;
                }

                turn.switchTurn();  // Switch to the other player
            }

            grid.printGrid();  // Display the final grid

            // Output the result of the game
            if (result.getWinner() != ' ') {
                System.out.println("Winner: " + result.getWinner());
            } else {
                System.out.println("It's a draw!");
            }

            // Ask if the players want to play again
            System.out.print("Do you want to play again? (Y/N): ");
            char playChoice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();  // Consume newline character

            playAgain = playChoice == 'Y';  // Continue if 'Y' is chosen
            if (!playAgain) {
                System.out.println("Thanks for playing!");
            }
        }
    }
}

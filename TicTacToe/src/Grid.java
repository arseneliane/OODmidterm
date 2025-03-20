
/*Alt + 218 → ┌
 * 
Alt + 191 → ┐

Alt + 192 → └

Alt + 217 → ┘*/ 
public class Grid {
    private char[][] board;
    private final String[] positions = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};

    public Grid() {
        board = new char[][] {
            {' ', ' ', ' '},  // Row A
            {' ', ' ', ' '},  // Row B
            {' ', ' ', ' '}   // Row C
        };
    }

    // Method to print the grid in the styled format with Unicode box-drawing characters
    public void printGrid() {
        System.out.println("    1   2   3");
        System.out.println("  ┌───┬───┬───┐");
        
        for (int i = 0; i < 3; i++) {
            System.out.print((char) ('A' + i) + " │ "); // Print row label (A, B, C)
            
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]); // Print cell value (empty or X/O)
                if (j < 2) System.out.print(" │ "); // Print vertical separator
            }
            
            System.out.println(" │");
            
            if (i < 2) { // Print horizontal separator after each row except the last
                System.out.println("  ├───┼───┼───┤");
            }
        }
        
        System.out.println("  └───┴───┴───┘"); // Print the bottom border
    }

    // Checks if the given move is valid
    public boolean isValidMove(String move) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].equals(move)) {
                int row = i / 3;
                int col = i % 3;
                return board[row][col] == ' '; // Ensure the cell is empty
            }
        }
        return false;
    }

    // Sets a player's sign in the specified cell
    public void setCell(String move, char sign) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].equals(move)) {
                int row = i / 3;
                int col = i % 3;
                board[row][col] = sign;
                return;
            }
        }
    }

    // Check if there's a winner in the grid
    public char checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return board[i][0]; // Row winner
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return board[0][i]; // Column winner
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0]; // Diagonal winner (top-left to bottom-right)
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2]; // Diagonal winner (top-right to bottom-left)
        
        return ' '; // No winner yet
    }

    // Check if the board is full (i.e., no empty spaces left)
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // There's at least one empty space
                }
            }
        }
        return true; // No empty spaces left, board is full
    }
}
 
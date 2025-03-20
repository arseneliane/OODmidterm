import java.util.Random;

public class Computer extends Player {
    private boolean hardMode;
    private Random random;

    public Computer(char sign, boolean hardMode) {
        super("Computer", sign);
        this.hardMode = hardMode;
        this.random = new Random();
    }

    @Override
    public void playTurn(Grid grid) {
        String move = hardMode ? findBestMove(grid) : getRandomMove(grid);
        grid.setCell(move, this.getSign());
        System.out.println("Computer played: " + move);
    }

    private String getRandomMove(Grid grid) {
        String[] positions = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};
        String move;
        do {
            move = positions[random.nextInt(9)];
        } while (!grid.isValidMove(move));
        return move;
    }

    private String findBestMove(Grid grid) {
        int bestScore = Integer.MIN_VALUE;
        String bestMove = "";
        String[] positions = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};

        for (String move : positions) {
            if (grid.isValidMove(move)) {
                grid.setCell(move, this.getSign());
                int score = minimax(grid, false);
                grid.setCell(move, ' '); // Undo move
                
                if (score > bestScore) {
                    bestScore = score;
                    bestMove = move;
                }
            }
        }
        return bestMove;
    }

    private int minimax(Grid grid, boolean isMaximizing) {
        char winner = grid.checkWinner();
        if (winner == this.getSign()) return 10;
        if (winner != ' ' && winner != this.getSign()) return -10;
        if (grid.isBoardFull()) return 0;

        int bestScore = isMaximizing ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        char currentPlayer = isMaximizing ? this.getSign() : (this.getSign() == 'X' ? 'O' : 'X');

        String[] positions = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};
        
        for (String move : positions) {
            if (grid.isValidMove(move)) {
                grid.setCell(move, currentPlayer);
                int score = minimax(grid, !isMaximizing);
                grid.setCell(move, ' '); // Undo move
                
                bestScore = isMaximizing ? Math.max(bestScore, score) : Math.min(bestScore, score);
            }
        }
        return bestScore;
    }
}

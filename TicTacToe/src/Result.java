public class Result {
    private char winner;

    public Result() {
        winner = ' ';  // Default winner is a draw
    }

    public void setWinner(char winner) {
        this.winner = winner;
    }

    public char getWinner() {
        return winner;
    }
}
public class Turn {
    private boolean playerOneTurn;

    public Turn() {
        playerOneTurn = true;
    }

    public boolean isPlayerOneTurn() {
        return playerOneTurn;
    }

    public void switchTurn() {
        playerOneTurn = !playerOneTurn;
    }
}

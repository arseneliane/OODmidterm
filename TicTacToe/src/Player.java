public abstract class Player {
    protected String name;
    protected char sign;

    public Player(String name, char sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public char getSign() {
        return sign;
    }

    public abstract void playTurn(Grid grid);
}

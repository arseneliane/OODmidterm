import java.util.Scanner;

public class Human extends Player {
    public Human(String name, char sign) {
        super(name, sign);
    }

    @Override
    public void playTurn(Grid grid) {
        Scanner scanner = new Scanner(System.in);
        String cell;
        do {
            System.out.print(name + " (" + sign + "), enter your move (A1-C3): ");
            cell = scanner.next().toUpperCase();
        } while (!grid.isValidMove(cell));
        grid.setCell(cell, sign);
    }
}

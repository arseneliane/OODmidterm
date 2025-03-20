# Tic-Tac-Toe (Java)

## Introduction
This is a **text-based Tic-Tac-Toe** game developed in Java using Object-Oriented Programming (OOP) principles. Players can compete against each other or challenge an AI opponent with different difficulty levels.

## Game Modes
- **Human vs. Human**: Two players take turns.
- **Human vs. Computer**:
  - **Easy Mode**: The computer selects moves randomly.
  - **Hard Mode**: The AI uses the **Minimax algorithm** to make optimal moves.

## How to Play
1. Run the program by executing the `Main` class.
2. Enter Player 1's name and choose a sign (**X or O**).
3. Select an opponent (**Human or Computer**).
4. If playing against the computer, choose difficulty (**Easy or Hard**).
5. Input moves using grid labels (**A1, B2, C3**, etc.).
6. The game continues until a player wins or the board is full (draw).
7. Choose to **play again** or exit.

## Example Output
```
Welcome to Tic-Tac-Toe!
Enter Player 1's name: Alice
Choose your sign (X/O): X
Choose opponent: (1) Human  (2) Computer
Enter choice: 2
Choose difficulty: (1) Easy  (2) Hard
Enter choice: 2

   A   B   C
1  _ | _ | _
2  _ | _ | _
3    |   |  

Alice's turn (X). Enter your move: A1

   A   B   C
1  X | _ | _
2  _ | _ | _
3    |   |  

Computer's turn (O)...

   A   B   C
1  X | _ | _
2  _ | O | _
3    |   |  

Alice's turn (X). Enter your move:
```

## Features
- **Formatted Grid Display** with labeled positions for clarity.
- **Turn-Based Play** with automatic player switching.
- **Winner & Draw Detection** with real-time updates.
- **AI Opponent** that adjusts based on difficulty.
- **Replay Option** to restart after a match.

## File Structure
- `Main.java` → Launches the game.
- `Game.java` → Manages game flow and interactions.
- `Grid.java` → Handles board updates and validation.
- `Player.java` → Base class for player-related logic.
- `Human.java` → Handles human player input.
- `Computer.java` → Implements AI behavior for Easy & Hard modes.
- `Turn.java` → Controls turn switching.
- `Result.java` → Determines and stores game outcomes.

## Notes
- Designed without exception handling (as preferred).
- Hard mode AI is **unbeatable** using Minimax.
- Easy mode AI provides a relaxed gameplay experience.

## Future Enhancements
- Implementing a **Graphical User Interface (GUI)**.
- Expanding AI strategies for more variety.
- Introducing additional difficulty levels.

## Creator
Developed by Arsen Eliane.

Enjoy playing Tic-Tac-Toe!


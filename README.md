# Tic-Tac-Toe Game

## Introduction
This is a **text-based Tic-Tac-Toe game** implemented in Java using Object-Oriented Programming (OOP) principles. The game allows a player to compete against another human or an AI-controlled computer.

## Features
- **Two-player mode**: Play against another human.
- **AI opponent**: The computer uses the **Minimax algorithm** for optimal moves.
- **Formatted Grid Display**: The board is displayed with labeled positions (e.g., `A1`, `B2`, etc.).
- **Turn-based system**: Players take turns automatically.
- **Game result detection**: Identifies winners or a tie.

## UML Design
The game follows a structured OOP design with the following classes:

### 1. Game
- Manages the game flow and players.
- Holds the **Grid**, **Turn**, and **Result** objects.
- Handles player selection and game execution.

### 2. Player (Abstract Class)
- Represents a generic player with `name` and `sign` (`X` or `O`).
- Has a method `doTurn(Grid grid)`, which is implemented differently by `Human` and `Computer`.

### 3. Human (Extends Player)
- Allows a human to input their move.

### 4. Computer (Extends Player)
- Uses `findBestMove()` and `minimax()` to make optimal moves.

### 5. Grid
- Stores the game board (`char[3][3]`).
- Checks for **valid moves, winners, and a full board**.

### 6. Turn
- Tracks whose turn it is using `playerOneTurn: boolean`.
- Method `playOneTurn()` controls a single turn.

### 7. Result
- Stores and retrieves the game’s outcome.

## How to Play
1. **Run the program**.
2. **Choose your opponent** (Human or Computer).
3. **Take turns placing X or O** by entering positions (e.g., `A1`, `B2`).
4. The game will display the updated board after each move.
5. The game ends when a player wins or there is a tie.

## Installation & Execution
1. Clone or download the project.
2. Open the project in **Eclipse** (or any Java IDE).
3. Compile and run the `Main` class:

## Future Improvements
- Implement a GUI for better interaction.
- Add a scoreboard feature.
- Allow users to set custom board sizes.
- Allow users to play against each other online. 
## Author
Developed by Arsen Eliane as part of an **OOP midterm** in Java.



# Tic-Tac-Toe (Java)

## Overview
This is a simple text-based Tic-Tac-Toe game implemented in Java using Object-Oriented Programming (OOP) principles. The game allows two players to play against each other or against a computer opponent.

## Features
- **Player vs. Player Mode**: Two human players can play against each other.
- **Player vs. Computer Mode**: A human player can play in 'single player mode'.
- **Formatted Grid Display**: The board is displayed in a clean, indexed and readable format.
- **Replay Option**: Players can choose to play again after each game.

## How to Play
1. Run the program.
2. Enter player names and choose whether to play against another human or the computer.
3. The board is labeled as follows:
   ```
       1   2   3
     ┌───┬───┬───┐
   A │   │   │   │
     ├───┼───┼───┤
   B │   │   │   │
     ├───┼───┼───┤
   C │   │   │   │
     └───┴───┴───┘
   ```
4. Players take turns selecting a cell by entering a position (e.g., `A1`, `B3`).
5. The game continues until there is a winner or the board is full.
6. After the game ends, players can choose to play again or quit.

## Class Structure
### **1. `Main`**
- Starts and controls the game loop.
- Handles user input for replaying or exiting the game.

### **2. `Game`**
- Manages the flow of the game.
- Switches turns between players.
- Checks for a winner or draw.

### **3. `Grid`**
- Stores the game board.
- Validates and applies moves.
- Displays the grid in a formatted manner.

### **4. `Player` (Abstract Class)**
- Defines common behavior for all players.
- Stores player name and symbol (`X` or `O`).

### **5. `Human` (Extends `Player`)**
- Handles user input for making a move.
- Allows the player to type `exit` to leave the game.

### **6. `Computer` (Extends `Player`)**
- Implements a basic AI that makes optimal moves using the minimax algorithm.
- Plays automatically as `X` or `O`.

## Running the Game
### **Prerequisites**
- Install Java (JDK 8 or higher).
- Compile and run using a Java IDE (e.g., Eclipse) or the terminal.

### **Run via Terminal**
1. Open a terminal in the project directory.
2. Compile the code:
   ```sh
   javac Main.java
   ```
3. Run the game:
   ```sh
   java Main
   ```

## Future Improvements
- Enhance AI difficulty levels.
- Add a graphical user interface (GUI).
- Implement online multiplayer functionality.

## Creator
-Arsen Eliane

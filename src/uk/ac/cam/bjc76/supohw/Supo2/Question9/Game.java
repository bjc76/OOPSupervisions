package uk.ac.cam.bjc76.supohw.Supo2.Question9;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    private ArrayList<Guess> previousGuesses = new ArrayList<>();
    private int currentGuessNumber = 1;
    private int maximumGuesses;
    private IntegerToGuess currentInteger;
    private final PlayerManager playerManager = new PlayerManager();
    private int difficulty = 1;
    private final Scanner scanner = new Scanner(System.in);

    private void setIntegerToGuess() {
        maximumGuesses = 8-difficulty;
        currentInteger = new IntegerToGuess((int) (Math.random()*100) % (20+10*difficulty));
    }

    public void startGame() {
        currentGuessNumber = 1;
        previousGuesses.clear();
        setIntegerToGuess();
        if (!playerManager.existsAnyPlayer()) {
            playerManager.initalisePlayer();
        }
        System.out.printf("Welcome to a new game %s.%n",
                playerManager.getCurrentPlayer().getName());
        if (playerManager.getCurrentPlayer().getLowestScore() != -1) {
            System.out.printf("Your lowest score is %d.\n",playerManager.getCurrentPlayer().getLowestScore());
        }
        System.out.println("Enter difficulty");
        try {
            int new_difficulty = Integer.parseInt(scanner.nextLine());
            if (new_difficulty >= 1 && new_difficulty <= 3) {
                difficulty = new_difficulty;
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid difficulty setting. Difficulty set to default (1)");
        }
        nextMove();
    }

    public void nextMove() {
        if (!previousGuesses.isEmpty()) {
            System.out.println("Previous guesses:");
        }
        for (Guess g : previousGuesses){
            System.out.println(g.toString());
        }
        boolean validInput = false;
        int guess = 0;
        while (!validInput) {
            System.out.printf("\nGuess number: %d \nEnter your guess:  ",currentGuessNumber);
            String guessString = scanner.nextLine();
            try {
                guess = Integer.parseInt(guessString);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("\n\nPlease only enter a valid integer\n");
            }
        }
        if (currentInteger.isCorrect(guess)) {
            playerManager.getCurrentPlayer().updateLowestScore(currentGuessNumber);
            System.out.printf("\n\nCorrect!! \nThe secret number was %d, " +
                            "well done for guessing correctly.\nYour score was %d\n",
                    currentInteger.getValue(),
                    currentGuessNumber);
            System.out.println("Press enter to play a new game, 'exit' to quit, or 'change' to change player");
        } else if (currentGuessNumber == maximumGuesses - 1) {
            System.out.println("Incorrect. You have reached the maximum number of guesses. Press enter to reset game, 'exit' to quit, or 'change' to change player");
        } else {
            String errorDirection = currentInteger.getDirection(guess);
            previousGuesses.addLast(new Guess(guess, currentGuessNumber, errorDirection.toLowerCase()));
            currentGuessNumber++;
            System.out.printf(errorDirection+"\n\n");
            nextMove();
        }
        String input = scanner.nextLine();
        if (Objects.equals(input, "exit")) {
            System.exit(0);
        } else if (Objects.equals(input, "change")) {
            playerManager.changePlayer();
            startGame();
        } else {
            startGame();
        }
    }

    public static void main (String[] args) {
        System.out.println("Welcome to the guessing game.");
        Game game = new Game();
        game.startGame();
    }


}

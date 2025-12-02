package uk.ac.cam.bjc76.supohw.Supo2.Question9;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PlayerManager {
    private Player currentPlayer;
    private ArrayList<Player> previousPlayerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void initalisePlayer() {
        System.out.println("Please enter your name:    ");
        String name = scanner.nextLine();
        currentPlayer = new Player(name);
    }

    public void changePlayer() {
        previousPlayerList.addLast(currentPlayer);
        System.out.println("Previous players: ");
        for (Player p: previousPlayerList) {
            System.out.println(p.getPlayerInfo());
        }
        System.out.println("Please enter your name");
        String input = scanner.nextLine();
        boolean requiresNewPlayer = true;
        for (Player p: previousPlayerList) {
            if (Objects.equals(p.getName(),input)) {
                currentPlayer = p;
                previousPlayerList.remove(currentPlayer);
                requiresNewPlayer = false;
            }
        }
        if (requiresNewPlayer) {
            currentPlayer = new Player(input);
        }
    }

    public boolean existsAnyPlayer() {
        return currentPlayer != null;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }




}

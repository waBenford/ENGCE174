package javaLab4.lab4_14;
import java.util.Scanner;

class ScoreBoard {
    private String gameName;
    private int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.print(gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + (i == scores.length - 1 ? "" : ", "));
        }
        System.out.println();
    }
}

public class Lab4_14 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print("Game Name: \n");
        String name = getValue.nextLine();
        
        int[] originalScores = new int[3];
        for (int i = 0; i < 3; i++) {
            originalScores[i] = getValue.nextInt();
        }

        ScoreBoard sb1 = new ScoreBoard(name, originalScores);
        
        ScoreBoard sb2 = new ScoreBoard(sb1);

        int newValue = getValue.nextInt();
        originalScores[0] = newValue;

        sb1.displayScores();
        sb2.displayScores();

        getValue.close();
    }
}
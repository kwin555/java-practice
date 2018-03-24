package com.company;

public class Main {

    public static void main(String[] args) {
        int highscore = calculateScore(true,800, 5, 100);
        System.out.println("Your final score was " + highscore);
        highscore = calculateScore(true,10000, 8, 200);
        System.out.println("Your final score was "+ highscore );
        int position1 = calculateHighScorePosition(1500);
        int position2 = calculateHighScorePosition(1000);
        int position3 = calculateHighScorePosition(500);
        int position4 = calculateHighScorePosition( 100);
        displayHighScorePosition("kevin",position1);
        displayHighScorePosition("Jeff",position2);
        displayHighScorePosition("Richard",position3);
        displayHighScorePosition("John", position4);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }
    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score <= 1000 && score > 500) {
            return 2;
        } else if (score > 100 && score <= 500) {
            return 3;
        } else {
            return 4;
        }
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the highscore table.");
    }
}

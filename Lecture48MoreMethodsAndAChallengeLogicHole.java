package com.s4ve;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculationScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 500;

        highScore = calculationScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score was " + highScore);

        int highScorePosition = calculationScorePosition(1500);
        displayHighScorePosition("watatat", highScorePosition );

       highScorePosition = calculationScorePosition(900);
        displayHighScorePosition("tongskieboy", highScorePosition );

       highScorePosition = calculationScorePosition(400);
        displayHighScorePosition("bob", highScorePosition );

        highScorePosition = calculationScorePosition(50);
        displayHighScorePosition("hello", highScorePosition );

        highScorePosition = calculationScorePosition(1500);
        displayHighScorePosition("hi", highScorePosition );

        highScorePosition = calculationScorePosition(600);
        displayHighScorePosition("hello", highScorePosition );

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "Manage to get into position "
                + highScorePosition + " on the high score table ");
    }

    public static int calculationScorePosition(int playerScore) {

        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;

    }

}


    public static int calculationScore(boolean gameOver,int score,int levelCompleted,int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
            return -1;
    }

}




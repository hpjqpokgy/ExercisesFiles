package com.s4ve;

public class Main {

    public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

//		if (score < 5000 && score > 1000) {
//			System.out.println("Your Score was less than 5000 but greater than 1000");
//	} else if(score < 1000) {
//			System.out.println("Your score was less than 1000");
//	} else {
//			System.out.println("Got here");
//		}

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your Final Score Was " + finalScore);
		}

		// Print out a second score on the screen with the following
		// Score was set to 10000
		// LevelCompleted set to 8
		// bonus set to 200
		// But make sure the first print out above display as well


//		boolean newGameOver = true;
//		int newScore = 10000;
//		int newLevelCompleted = 8;
//		int newBonus = 200;
//
//		if(gameOver) {
//			int newFinalScore = newScore + (newLevelCompleted * newBonus);
//			System.out.println("Your Final Score Was " + newFinalScore);
		}
		
		score = 10000;
		levelCompleted = 8;
		newBonus = 200;

		if(gameOver) {
			int newFinalScore = score + (levelCompleted * bonus);
			System.out.println("Your Final Score Was " + newFinalScore);
		}

	}
}

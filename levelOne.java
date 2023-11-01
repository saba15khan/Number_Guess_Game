package saba;
	import java.util.Scanner;
	import java.util.Random;

	public class levelOne {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minRange = 1;
	        int maxRange = 100;
	        int maxAttempts = 6;
	        int rounds = 0;
	        int score = 0;

	        System.out.println("Welcome to the Number Guessing Game!");

	        do {
	            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            boolean guessedCorrectly = false;

	            System.out.println("\nRound " + (rounds + 1));
	            System.out.println("Guess the number between " + minRange + " and " + maxRange);

	            while (!guessedCorrectly && attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess < targetNumber) {
	                    System.out.println("Too low! Try again.");}
	                    else if((userGuess+1)==targetNumber || (userGuess-1)==targetNumber) {
	                    	System.out.println("You are very near to the number.");
	                    
	                } else if (userGuess > targetNumber) {
	                    System.out.println("Too high! Try again.");
	                } else {
	                    guessedCorrectly = true;
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                    score += (maxAttempts - attempts + 1);
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + targetNumber);
	            }

	            rounds++;

	            System.out.print("Do you want to play another round? (yes/no): ");
	            String playAgain = scanner.next();
	            if (!playAgain.equalsIgnoreCase("yes")) {
	                break;
	            }
	        } while (true);

	        System.out.println("Game over! Your total score is: " + score);
	    }
	}


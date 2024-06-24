package com.codercamp;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		
		int currentGuess = 0;
		int noOfGuesses = 5;
		int randomNum;
		
		//this will create scanner to take-in user inputs.
		Scanner scanner = new Scanner(System.in);
				
		//this is to generate random number.
		Random random = new Random();
		randomNum = random.nextInt(101);
		
		System.out.println("Please pick a number between 1 and 100");
		
		for(int i = 1; i <= 5; i++) {
			currentGuess = scanner.nextInt();
						
			if(currentGuess < randomNum) {
				
				System.out.println("Your guess is low. Please pick a higher number.");
			}
				else if(currentGuess > randomNum) {
					
					System.out.println("Your guess is high. Please pick a lower number.");
				}
			
				else {
					
			System.out.println("Hurrayyy!!! You win. The randomly generated number was " 
					+ randomNum + " .");
				}
		}
		
		/*
		 * while(noOfGuesses > 0) { currentGuess--; System.out.println("You have " +
		 * noOfGuesses + " guesses left."); }
		 * 
		 * System.out.println("You have exhausted your number of guesses. " +
		 * "The guessing game is over.");
		 */
		
		scanner.close();
		
			}
		
		
	}
	
 
	

		
	
		
			
	



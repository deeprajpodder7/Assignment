package GuessTheNumberGame;

		// Java Program to play "Guess the Number" game.

import java.util.*;
class Game{  //class Game which allows a user to play "Guess the Number" game once.
    public int number,inputNumber;
    public int noOfGuesses = 0;
Game(){   //constructor to generate random numbers
        Random rand = new Random();  //creating object rand of Random Class
        this.number = rand.nextInt(100);  //generating random integer number within 100 inside number variable
    }
    void takeUserInput(){   //method to take a user input of number
        System.out.println("Guess the number within 100:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){  //method to detect whether the number entered by the user is true
        noOfGuesses++; //counter
        if (inputNumber==number){
            System.out.println("Yes you guessed it right!!! It was: " +number);
            System.out.println("No. of attempts: " +noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high..."); 
            }
        return false; } }
public class GuessingGame {   //Main Method
    public static void main(String[] args) {
       Game g = new Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber(); } } }
import java.util.Scanner;

class numberGuesser{
    public static void main(String args[]){

       int number = (int)(Math.random()*100+1);
       
       System.out.println("Guess a number from 1 to 100");

       Scanner scanner = new Scanner(System.in);

       int guess = 0;
       int numberOfGuesses = 0;
       while(guess != number){
            System.out.print("Enter a number: ");
            guess = scanner.nextInt();
            numberOfGuesses++;
            if(guess > number)
                System.out.println("Too big");
            else if(guess < number)
                System.out.println("Too small");
       }

       System.out.println("Correct. You guessed it! It is " + number);
       System.out.println("You did it in " + numberOfGuesses + " of guesses.");

    }
}
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {


            /* How the game works:
               User and opponent individually choose a move: Rock, Paper, or Scissors.
               User will either win, lose, or tie, based on their move and their opponents move.
               Rock beats Scissors, Scissors beats Paper, Paper beats Rock.
               If the user and opponent makes the same move, it's a tie.
            */

            // Storing options for moves that the user and computer will pick in the Rock Paper Scissors game.
            String Choice1 = "Rock";
            String Choice2 = "Paper";
            String Choice3 = "Scissors";

            // Prompt user to make their move.
            System.out.println("Choose (type) ONE of the following, case sensitive, then press ENTER: " +
                    "\n" + Choice1 +  ", " + Choice2 + ", " + "or " + Choice3 + "\n...");

            // Scan user's move and display it. UserChoice stores the user's move.
            Scanner scanner = new Scanner(System.in);
            String UserChoice = scanner.next();
                System.out.println("...");
                System.out.print("Your move: " + UserChoice);

            // Check whether or not the user's input is a valid option (Rock, Paper, or Scissors)
            // If not valid, display an error message and end game. If valid, continue.
            if(!UserChoice.equals(Choice1) && !UserChoice.equals(Choice2) && !UserChoice.equals(Choice3)){
                System.out.println("\n...");
                System.out.println("Invalid move. \nGame over, you suck at following directions.");
                System.exit(1);
            } else {
                System.out.println("");
            }

            // Generate and display random move by computer, either Rock, Paper, or Scissors.
            int rand = (int)((Math.random()*3)+1);
            String ComputerChoice = "";
            if(rand == 1) {
                ComputerChoice = (Choice1);
            }
            if(rand == 2) {
                ComputerChoice = (Choice2);
            }
            if(rand == 3) {
                ComputerChoice = (Choice3);
            }
            System.out.println("Computer's move: " + ComputerChoice);
            System.out.println("...");

            //check  and display whether user wins, ties, or looses.
            if(UserChoice.equals(Choice1) && ComputerChoice.equals(Choice3) ||
            UserChoice.equals(Choice2) && ComputerChoice.equals(Choice1) ||
            UserChoice.equals(Choice3) && ComputerChoice.equals(Choice2)) {
                System.out.println("Congrats, you win!");
            } else if(UserChoice.equals(ComputerChoice)) {
                System.out.println("Tie.");
            } else {
                System.out.println("You lose.");
            }

        }
}









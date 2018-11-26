/*
Mouner Dabjan
November 23 2018 
This program is based on a Rock Paper Scissors game
 */
package rock.paper.scissors;
import java.util.Scanner; 
/**
 *
 * @author canada
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyBoard = new Scanner (System.in);  //setting up the Scanner 
        String choice;  // Initializing a string variable to get the user's option 
        String [] userChoice = new String [5];  //Initializing an array too store the user's choices 
        String option = null; //Initializing a string variable option to print out the user's choices 
        int userWon=0; //Initializing an integer variable to count how many times the user won 
        int compWon=0; //Initializing an integer variable to count how many times the computer won 
        int draw=0;  //Initializing an integer variable to count how many times its a draw 
        int computerChoice = 0; //Intializing an integer vairable to help generate the random number thus the choices 
        
        // Untorduction to the game 
        System.out.println("Hello and welcome to my Rock, Paper and Scissors game ");                           
        System.out.println("This game is a best of 5 game where you will be competing against the computer");   
        System.out.println("");
        
        // starting a for loop with index of 0, it should loop 5 times as in 5 loops 
        for(int i=0; i<(userChoice.length); i++)
        {
            System.out.println("Enter your choice: "); //asking the user for their choice
            choice = keyBoard.nextLine(); // getting the user's input
            userChoice[i] = choice;   // storing the user's input
           
            
            compChoiceCompare(computerChoice,option,choice,draw,userWon,compWon); //calling the method in the main run 
   
        }
        
        System.out.println("");
        declareWinner(userWon,compWon, draw); //declaring the winner after the 5 rounds 
        
        System.out.println(userChoice); //printing out the user's 5 inputs 
         
    }
    
  /*
    This method generates a random number between 1 and 3 then using if statements, matches each number with an apprpriate choice
    in the game then printing it out. This method also compares the user's choice with the computer's and keeps tracks of the number
    of times the computer won, the user won and how many times it is a draw 
 */
    public static void compChoiceCompare(int n1, String n2, String n3, int draww, int won1, int won2)
    {
        n1 = (int)Math.round(Math.random()*2+1); //pre-defined method to generate 3 random numbers 
        
        //matching the number with a choice 
        if (n1 ==1) 
        {
            n2 = "Rock"; // using a string variable to help comparing later on 
            System.out.println("The computer's choice is Rock"); //printing the result to the screen 
        }
        if(n1==2)
        {
            n2="Paper";
            System.out.println("The computer's choice is Paper");
        }
        if(n1==3)
        {
            n2="Scissors"; 
            System.out.println("The computer's choice is Scissors");
        }
        
          
        // comparing the user's input with the computer's choice 
        if("Paper".equals(n3) && n2=="Paper")
        {
            System.out.println("Its a draw");
            draww +=1; //keeping track of the integer values of how many times each won or drew 
        }
                
        if("Paper".equals(n3) && n2=="Rock")
        {
            System.out.println("You win!");
            won1 +=1;
        }
        if("Paper".equals(n3) && n2=="Scissors")
        {
            System.out.println("The computer wins");
            won2 +=1;
        }
        if("Rock".equals(n3) && n2=="Rock")
        {
            System.out.println("Its a draw");
            draww +=1; 
        }
        if("Rock".equals(n3) && n2=="Scissors")
        {
            System.out.println("You win!");
            won1 +=1;
        }
        if("Rock".equals(n3) && n2=="Paper")
        {
            System.out.println("The computer wins");
            won2 +=1; 
        }
        if("Scissors".equals(n3) && n2=="Scissors")
        {
            System.out.println("Its a draw");
            draww +=1;
        }
        if("Scissors".equals(n3) && n2=="Paper")
        {
            System.out.println("You win!");
            won1 +=1;
        }
        if("Scissors".equals(n3) && n2=="Rock")
        {
            System.out.println("The computer wins");
            won2 +=1; 
        }
    }
    
/*
This method compares the number of times the user or the computer won and how many times they drew and declares the winner 
*/
    public static void declareWinner(int n1, int n2, int n3)
    {
        if(n1>n2)
        {
            System.out.println("The game is over and you win!");
        }
        else
            if( n1>n3 && n3>n2)
                
                {
                    System.out.println("The game is over and you win!");
                }
        else
            if(n2>n1)
                
                {
                    System.out.println("The game is over and the computer wins!");
                }
        else
                if(n2>n3 && n3>n1)
                {
                    System.out.println("The game is over and the computer wins");
                }
        else
                    if(n2==n1)
                    {
                        System.out.println("The game is over and its a draw!");
                    }

    }
    
 
    
    
}

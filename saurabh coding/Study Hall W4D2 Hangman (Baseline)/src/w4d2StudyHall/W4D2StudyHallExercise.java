package w4d2StudyHall;

import java.util.Scanner;

public class W4D2StudyHallExercise 
{
              /* Replace this line with a proper header which includes your name */

              private static String usersName;
              private static String inputFromUser;
              private static char menuCharacter;
            
              
              // coding done by saurabh mishra
             
              
            
              
              public static void main(String args[]) 
              {
            	  System.out.println("welcome!");
              
                           /* Initialize the Text Hangman game */
                           
                           Scanner nikhil= new Scanner(System.in);
              
                           /* Welcome the user and request the user to enter a name */

System.out.println("please enter your name followed by return");
                           String username= nikhil.nextLine();
                           System.out.println("your name entered" +username);
/* Read in the user's name */

                           while (true) // impelmenting while ;loop
                           {

                                         
                                         /* Display menu */

                           System.out.println(usersName+"  please enter a command letter by return"); 
                           System.out.println("P-> Play the game");
                           System.out.println("s-> View statisitics");
                           System.out.println("q-> Quit");

                                         /* Read the menu character */


                                         /* Play the game? */
                           menuCharacter = nikhil.next().charAt(0);
                           if (menuCharacter == 'p') {

                        	   System.out.println("Play the game command recognized");
                               System.out.println(usersName+"  please enter a command letter followed by a return! ");
                               System.out.println("P-> Play the game");
                               System.out.println("s-> View statisitics");
                               System.out.println("q-> Quit");
                               
                               } 
                               else if (menuCharacter == 's')
                               {
                                               System.out.println("View the statistics command recognized.");
                                               System.out.println( usersName+"  please enter a command letter followed by a return!");

                                               System.out.println("P-> Play the game");
                                               System.out.println("s-> View statisitics");
                                               System.out.println("q-> Quit");
                                               menuCharacter = nikhil.next().charAt(0);
                               }
                               else if (menuCharacter == 'q')
                               {
                                               System.out.println("Quit the game command recodnized");
                                               System.out.println("Thanks for plaiyng  "+usersName);
                               }
                               else
                               {
                                               System.out.println("*** Error *** ");
                                               System.out.println("Invalid menu item entered.  It must be p, s, or q! ");
                                               System.out.println("The input found was:" + menuCharacter );
                                               System.out.println(usersName+" please enter a command letter followed by a return! ");
                                               System.out.println("P-> Play the game");
                                               System.out.println("s-> View statisitics");
                                               System.out.println("q-> Quit");
                               }

              }

}   }                       



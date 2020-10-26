// EnigmaInput.java
/** 
  * Using Java to prototype console based input from user for Enigma. 
  * access modifiers and modularization to be dealth with later.
**/

// Apparently we need this to retrieve user input
import java.util.Scanner; 

// first class definition
public class EnigmaInput 
{
    // Shared (extensible?) Scanner for input
    private static Scanner scanner = new Scanner(System.in);
    // process execution
        public static void main(String[] args)
        {
            // Prompt user for message.
            System.out.print("Type your message for Enigma: ");

            // Get message from user.
            String message = scanner.nextLine();

            // Display the input back to user
            System.out.println( "Input: " + message );

        } // end main method
 
}// end EnigmaInput class

/* Can message object (arg?) with input String be accessed outside of EnigmaInput class?
Access modifiers and strategic use of method calls COMING SOON!*/

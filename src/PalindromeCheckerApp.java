import java.util.Scanner;

/**MAIN CLASS UseCaselPalindromeApp

Use Case 2: Application Entry & Welcome Message

 Description:

 This class demonstrates basic palindrome validation
 using a hardcoded string value.

 At this stage, the application:
 Stores a predefined string
 Compares characters from both ends
 Determines whether the string is a palindrome
 Displays the result on the console
 This use case introduces fundamental comparison logic
 before using advanced data structures.

@author Vikhyat
@version 1.0
*/

public class PalindromeCheckerApp {
    /**
     * Application entry point.
     * This is the first method executed by the JVIN
     * when the program starts.
     * @param args Command-line arguments
     */
    public static void main(String[] args){{
        Scanner in=new Scanner(System.in);
        String input;int i; boolean isPalindrome=true;
        System.out.print("Enter String: ");
        input=in.next();
        for (i=0;i<input.length()/2;i++){
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.print("Is it a Palindrome? : ");
        if(isPalindrome==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
    }
}

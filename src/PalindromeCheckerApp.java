import java.util.LinkedList;
import java.util.Scanner;
/**MAIN CLASS UseCaselPalindromeApp

Use Case 12:  Strategy Pattern for Palindrome Algorithms (Advanced)

 Description:

 This class valldates a pahndrome uszng recursion.
 Characters are compared from the outer positions
 mcnng inward using recurnve calls.
 The recurszon stops when
 - All characters are matched,
 - A nsratch is found.
 This use case demonstrates divide-and-conquer
 logic using method recursxon.

@author Vikhyat
@version 1.0
*/

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String input = in.nextLine().toLowerCase();

        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome: " + result);

        in.close();
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
/**MAIN CLASS UseCaselPalindromeApp

Use Case 7: Deque Based Optimized Palindrome Checker

 Description:

 This class validates a palindrome using a Deque (Double Ended Queue).
 Characters are inserted into the deque and then compared by removing elements from both ends:
 removeFirst()
 removeLast()
 This avoids reversing the string and provides an efficient front-to-back comparison approach.
 This use case demonstrates optimal bidirectional traversal using Deque.

@author Vikhyat
@version 1.0
*/

public class PalindromeCheckerApp {
    /**
     * Application entry point.
     * This is the first method executed by the JVIN
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args){{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String input = in.next();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome);
    }
    }
}

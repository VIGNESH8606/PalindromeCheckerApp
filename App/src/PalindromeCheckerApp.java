import java.util.*;

//Version 7
//Author Vignesh Ragav
//Use Case 7: Deque Based Method
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size()>1)
        {
            if(deque.removeFirst()!=deque.removeLast())
            {
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)
        {
            System.out.println("Input :"+input);
            System.out.println("Is it a palindrome? "+isPalindrome);
        }
        else{
            System.out.println("Input :"+input);
            System.out.println("Is it a palindrome? "+isPalindrome);
        }

    }
}

import java.util.Stack;

//Version 5
//Author Vignesh Ragav
//Use Case 5: Stack Based Method
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        boolean isPalindrome = true;
        for(char c : input.toCharArray())
        {
            stack.push(c);
        }
        for(char c : input.toCharArray())
        {
            if(c!=stack.pop())
            {
                isPalindrome = false;
            }
        }
        System.out.println("Input :"+input);
        System.out.println("Is it a palindrome? "+isPalindrome);
    }
}

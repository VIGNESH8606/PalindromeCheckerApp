import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Version 6
//Author Vignesh Ragav
//Use Case 6: Queue and Stack Based Method
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty())
        {
            if(queue.remove()!=stack.pop())
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
        System.out.println("Input :"+input);
        System.out.println("Is it a palindrome? "+isPalindrome);
    }
}

import java.util.*;

//Version 8
//Author Vignesh Ragav
//Use Case 8: Linked list Based Method
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "refer";
        LinkedList<Character> linkedList = new LinkedList<>();
        for(char c : input.toCharArray()) {
            linkedList.add(c);
        }
        boolean isPalindrome = true;
        while (linkedList.size()>1)
        {
            if(linkedList.removeFirst()!=linkedList.removeLast())
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

import java.util.*;

//Version 8
//Author Vignesh Ragav
//Use Case 8: Linked list Based Method
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "A man, a plan, a canal: Panama";
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = false;
        for(int i=0; i<normalized.length()/2;i++)
        {
            if(normalized.charAt(i)==normalized.length()-1-i)
            {
                isPalindrome=true;

            }
        }



        System.out.println("Input : "+input);
        if(isPalindrome==true)
        {
            System.out.println("Is Palindrome : "+isPalindrome);
        }
        else {
            System.out.println("Is Palindrome : "+isPalindrome);
        }
    }
}

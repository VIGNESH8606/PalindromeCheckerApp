//Version 2
//Author Vignesh Ragav
//Use Case 3: Reverse Method
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "madam";
        String reversed = "";
        boolean isPalindrome = false;
        for(int i=input.length()-1; i>=0;i--)
        {
            reversed=reversed+input.charAt(i);
        }
        System.out.println("Input Text: "+input);
        if(reversed.equals(input))
        {
            isPalindrome = true;
        }
        System.out.println("Is it a palindrome? "+isPalindrome);
    }
}

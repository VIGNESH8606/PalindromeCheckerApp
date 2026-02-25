//Version 2
//Author Vignesh Ragav
//Use Case 2: Hardcoded
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "madam";
        boolean isPalindrome = false;
        for(int i=0; i<input.length()/2;i++)
        {
            if(input.charAt(i)==input.charAt(input.length()-1))
            {
                isPalindrome = true;
            }
        }
        System.out.println("Input Text: "+input);
        System.out.println("Is it a palindrome? "+isPalindrome);
    }
}

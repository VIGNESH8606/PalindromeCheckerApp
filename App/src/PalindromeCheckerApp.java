//Version 4
//Author Vignesh Ragav
//Use Case 4: Character Array Based Method
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "radar";
        char[] chars = input.toCharArray();
        int start =0;
        int end = input.length()-1;
        boolean isPalindrome = true;
        while(start<end)
        {
            if(chars[start]!=chars[end])
            {
                isPalindrome =false;
            }
            start++;
            end--;
        }
        System.out.println("Input :"+input);
        System.out.println("Is it a palindrome? "+isPalindrome);
    }
}

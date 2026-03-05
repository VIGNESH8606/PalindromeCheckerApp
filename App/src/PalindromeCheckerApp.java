import java.util.*;

//Version 11
//Author Vignesh Ragav
//Use Case 11: OODP Based Method
class PalindromeService
{
    public boolean palindrome(String input)
    {
        int start=0;
        int end = input.length()-1;
        while (start<end){
            if(input.charAt(start)!=input.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        PalindromeService service = new PalindromeService();
        String input = "racecar";
        boolean result = service.palindrome(input);
        System.out.println("Input : "+input);
        System.out.println("Is Palindrome : "+result);
    }
}

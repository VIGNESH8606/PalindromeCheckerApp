import java.util.*;

//Version 8
//Author Vignesh Ragav
//Use Case 8: Linked list Based Method
public class PalindromeCheckerApp
{
    public static boolean Check(String input, int start, int end)
    {
        if(start>=end)
        {
            return true;
        }
        else {
            if(input.charAt(start)!=input.charAt(end))
            {
                return false;
            }
        }
        return Check(input,start+1,end-1);
    }
    public static void main(String[] args)
    {
        String input = "madam";
        boolean result = Check(input,0,input.length()-1);
        System.out.println("Input : "+input);
        if(result==true)
        {
            System.out.println("Is Palindrome : "+result);
        }
        else {
            System.out.println("Is Palindrome : "+result);
        }
    }
}

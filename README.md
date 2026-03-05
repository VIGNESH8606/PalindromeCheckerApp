# PalindromeCheckerApp
//Initialize Pointers:
//Set a start pointer to 0 (the first character of the string).
//Set an end pointer to length - 1 (the last character of the string).
//Iterative Comparison:
//While the start pointer is less than the end pointer:
// Compare the character at the start position with the character at the end position.
//If they do not match: Immediately conclude the string is not a palindrome and return false.
//If they do match:
//Increment the start pointer (move right).
//Decrement the end pointer (move left).
//Conclusion:If the loop finishes without finding a mismatch, the string is a palindrome; return true.
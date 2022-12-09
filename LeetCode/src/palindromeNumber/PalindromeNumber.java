package palindromeNumber;

public class PalindromeNumber {
	
    /*
    Start by getting rid of the edge cases. Negative numbers cannot be palindromes.
    Numbers ending in 0 cannot be palindromes since they'd also need to start
    with 0.
    */ 
    public boolean isPalindrome(int x) {
        if( x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        
        int reverseNum = 0;
        // meant to get to halfway point in number
        while(x > reverseNum){
            // Last digit, 2nd to last, 3rd to last..
            reverseNum = reverseNum * 10 + x % 10;
            // remove last digit from x
            x /= 10;
        }
        // middle num doesn't matter, get rid of it, compare
        return x == reverseNum || x == reverseNum / 10;
    }

}

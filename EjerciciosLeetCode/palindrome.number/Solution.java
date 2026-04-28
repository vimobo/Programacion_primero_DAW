import  java.lang.StringBuilder;
public class Solution {
    
    public static boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        StringBuilder xString =  new StringBuilder(Integer.toString(x));
        StringBuilder xStringCompare = xString.reverse();
        
        if(xString.equals(xStringCompare))
            isPalindrome = true;
        return isPalindrome;
    }

    public Solution() {
    }
}
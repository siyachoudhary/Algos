// PALINDROME NUMBER ALGORITHM
// Given an integer x, return true if x is a palindrome, and false otherwise.

// examples: 
// x = 1221. Return true because 1221 = 1221 forwards and backwards
// x = 152. Return false because 152 != 251

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String num = String.valueOf(x);
        int numLength = num.length();
        for(int i = 0; i<numLength/2; i++){
            if(num.charAt(i)!=num.charAt(numLength-1-i)){
                return false;
            }
        }
        return true;
    }
}
// PALINDROME NUMBER ALGORITHM

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
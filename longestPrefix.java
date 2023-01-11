// LONGEST COMMON PREFIX
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = "";
        int shortestLen = strs[0].length();
        for(int i = 0; i< strs.length; i++){
            if(strs[i].length()<shortestLen){
                shortestLen = strs[i].length();
            }
        }
        for(int i =0; i<shortestLen; i++){
            String letter = strs[0].substring(i, i+1);
            for(int j = 0; j<strs.length; j++){
                if(!strs[j].substring(i, i+1).equals(letter)){
                    return pref;
                }
            }
            pref = pref+letter;
        }
        return pref;
    }
}
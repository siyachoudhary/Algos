class Solution {
    public int lengthOfLastWord(String s) {
        String word = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.substring(i, i+1).equals(" ")){
                if(!word.equals("")){
                    break;
                }
            }else{
                word=s.substring(i, i+1) + word;
            }
        }
        return word.length();
    }
}
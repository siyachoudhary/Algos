// ROMAN TO INTEGER
// For example, 2 is written as II in Roman numeral, just two ones added together. 
// 12 is written as XII, which is simply X + II. 
// The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right.
// However, the numeral for four is not IIII. Instead, the number four is written as IV. 
// Because the one is before the five we subtract it making four. 
// The same principle applies to the number nine, which is written as IX. 
// There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.

// Given a roman numeral, convert it to an integer.

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i = 0; i<s.length(); i++){
            String currentRomanLetter = s.substring(i, i+1);
            String nextRomanLetter = "Y";
            if(i!=s.length()-1){
                nextRomanLetter = s.substring(i+1, i+2);
            }
            if (currentRomanLetter.equals("I") && (nextRomanLetter.equals("V") || nextRomanLetter.equals("X"))) {
                num -= 1;
            } else if (currentRomanLetter.equals("X") && (nextRomanLetter.equals("L") || nextRomanLetter.equals("C"))) {
                num-=10;
            } else if (currentRomanLetter.equals("C") && (nextRomanLetter.equals("D") || nextRomanLetter.equals("M"))) {
                num-=100;
            }else{
                if(currentRomanLetter.equals("I")){
                    num+=1;
                }else if(currentRomanLetter.equals("V")){
                    num+=5;
                }else if(currentRomanLetter.equals("X")){
                    num+=10;
                }else if(currentRomanLetter.equals("L")){
                    num+=50;
                }else if(currentRomanLetter.equals("C")){
                    num+=100;
                }else if(currentRomanLetter.equals("D")){
                    num+=500;
                }else if(currentRomanLetter.equals("M")){
                    num+=1000;
                }
            }
        }
        return num;
    }
}
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
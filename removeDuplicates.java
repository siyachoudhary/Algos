// REMOVE DUPLICATES FROM SORTED ARRAY

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        int uniques = 1; 

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]){ 
              nums[uniques] = nums[i + 1];
              uniques++;
            }
        }
        return uniques;
    }
}
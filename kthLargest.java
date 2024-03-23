class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                // Check if the current element is greater than the next element
                if (nums[j] > nums[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
        return nums[nums.length-k];
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int finalMax = nums[0]
        for (int j = 0; j < k; j++) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i>nums[max]]){
                    max=i;
                }
            }
            finalMax=nums[i]
            nums[i] = 0;
        }

        return finalMax
    }
}
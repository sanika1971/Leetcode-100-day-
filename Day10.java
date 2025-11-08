public class Day10 {
  class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        
        // Sum of first n natural numbers formula: n*(n+1)/2
        int actualSum = (range * (range + 1)) / 2;
        
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
        }
        
        int ans = actualSum - currSum;
        return ans;
    }
}

}

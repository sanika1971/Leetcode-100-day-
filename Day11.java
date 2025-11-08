public class Day11 {
    public static class Solution {
        public int removeElement(int[] nums, int val) {
            int ptr = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[ptr] = nums[i];
                    ptr++;
                }
            }

            return ptr;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = sol.removeElement(nums, val);

        System.out.println("New length after removing " + val + ": " + newLength);
        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}



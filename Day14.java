public class Day14 {


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int pro = 1;

        // Calculate right-side product
        for (int i = n - 1; i >= 0; i--) {
            pro = pro * nums[i];
            right[i] = pro;
        }

        int[] ans = new int[n];
        int left = 1;

        // Calculate result using left and right products
        for (int i = 0; i < n - 1; i++) {
            int val = left * right[i + 1];
            ans[i] = val;
            left = left * nums[i];
        }

        ans[n - 1] = left;

        return ans;
    }

    // For testing
    public static void main(String[] args) {
        Day14 sol = new Day14();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);

        System.out.print("Product Except Self: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}


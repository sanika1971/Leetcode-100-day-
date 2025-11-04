public class Day8 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }

    public static void main(String[] args) {
        Day8 sol = new Day8();
        int[] nums = {3, 4, 5, 2};
        System.out.println(sol.maxProduct(nums));
    }
}

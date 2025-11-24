import java.util.HashMap;

public class Day20 {

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 1);
            }
        }

        int ans = -1;
        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4};   // Example input
        int result = findLucky(arr);

        System.out.println("Lucky Number: " + result);
    }
}


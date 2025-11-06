public class Day9 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1, nums2);
       
        if (merged.length % 2 == 0) {
            double median = (double) (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2;
            return median;
        }
        else {
            double median = (double) merged[merged.length / 2];
            return median;
        }
    }
    
    private int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        
        int p1 = 0; 
        int p2 = 0; 
        int p3 = 0; 
        
     
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] <= arr2[p2]) {
                result[p3] = arr1[p1];
                p1++;
            } else {
                result[p3] = arr2[p2];
                p2++;
            }
            p3++;
        }
        
      
        while (p1 < arr1.length) {
            result[p3] = arr1[p1];
            p1++;
            p3++;
        }
        
     
        while (p2 < arr2.length) {
            result[p3] = arr2[p2];
            p2++;
            p3++;
        }
        
        return result;
    }

  
    public static void main(String[] args) {
        Day9 obj = new Day9(); 
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + obj.findMedianSortedArrays(nums1, nums2)); 
    }
}

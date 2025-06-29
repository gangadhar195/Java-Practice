import java.util.Arrays;

public class MidOofArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergeArray[] = new int[nums1.length + nums2.length];
        double mid = 0;

        // Merge both arrays
        for (int i = 0; i < nums1.length; i++) {
            mergeArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            mergeArray[nums1.length + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(mergeArray);

        int n = mergeArray.length;

        if (n == 0) {
            System.out.println("Array is empty.");
            return 0;
        }

        // Median calculation
        if (n % 2 == 0) {
            mid = (mergeArray[(n / 2) - 1] + mergeArray[n / 2]) / 2.0; // Note: 2.0 for double division
        } else {
            mid = mergeArray[n / 2];
        }

        return mid;
    }

    public static void main(String args[]) {
        int num1[] = {1, 2};
        int num2[] = {3,4};

        MidOofArray obj = new MidOofArray(); // Create object
        double result = obj.findMedianSortedArrays(num1, num2);
        System.out.println(result);
    }
}

public class MidOofArray {

     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergeArray[]= new int[nums1.length+nums2.length];
        double mid = 0;
        for(int i=0;i<nums1.length;i++){
            mergeArray[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            mergeArray[nums1.length+i]=nums2[i];
        }
        int n = mergeArray.length;

         if (n == 0) {
            System.out.println("Array is empty.");
            return 0;
        }

        if (n % 2 == 0) {
            
            mid =  (mergeArray[(n / 2) - 1] + mergeArray[n / 2])/2;
            return mid;
        } else {
            
            mid =  mergeArray[n / 2];
            return mid;
        }
        
    }
    public static void main(String args[]){
        int num1[] = {1,3};
        int num2[] = {2};
        // findMedianSortedArrays(nums1,nums2);

        System.out.println(findMedianSortedArrays(num1,num2));
    }
}

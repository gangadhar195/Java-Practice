package Assignments;

public class Practics {

    public static void reverseString(String str) {
        StringBuilder newstr = new StringBuilder();
        System.out.println("old String : " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            newstr.append(str.charAt(i));
        }
        System.out.println("Reverse String : " + newstr);

    }

    public static boolean checkprime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int k = 1; // First element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String args[]) {
        // String str = "sunday";
        // String rev = "";

        // System.out.println("old String : "+str);
        // for(int i=str.length()-1;i>=0;i--){
        // rev += str.charAt(i);
        // }
        // System.out.println("Reverse String : "+rev);

        // reverseString(str);

        // int n =7;

        // checkprime(n);
        // System.out.println(checkprime(n));

        int nums[] = { 1, 1, 2 };
        int[] expectedNums = {0,1,2,3,4};
        // removeDuplicates(arr);
        int k = new Practics().removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

    }
}

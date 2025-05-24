package Assignments;

public class Assignment1 {
    public static void PrintNums(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[i+1]){
                System.out.println(true);
                break;
            }
            else{
                System.out.println(false);
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        PrintNums(nums);
    }
}

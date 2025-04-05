public class LargestArray {

    public static int findArrayElement(int arr[]){
        int larget =Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
    
        for(int i=0;i<arr.length;i++){
            if(larget<arr[i]){
                larget=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Array Elememt : "+smallest);

        return larget;

    }
   public static void main(String args[]){
    int arr[]={1,2,4,3,5,6};
    // findArrayElement(arr);
    System.out.println("Largest No : "+findArrayElement(arr));
   } 
}

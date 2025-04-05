public class LargestArray {

    public static int findArrayElement(int arr[]){
        int larget =Integer.MIN_VALUE;
    
        for(int i=0;i<arr.length;i++){
            if(larget<arr[i]){
                larget=arr[i];

            }
        }
        return larget;

    }
   public static void main(String args[]){
    int arr[]={1,2,4,3,5,6};
    // findArrayElement(arr);
    System.out.println("Largest No : "+findArrayElement(arr));
   } 
}

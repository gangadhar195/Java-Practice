public class CheckArray{

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return firstOccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,6,4,5,6};
        // System.out.println(isSorted(arr, 0));
        // firstOccurence(arr, 6, 0);
        System.out.println(firstOccurence(arr, 6, 0));

    }
}
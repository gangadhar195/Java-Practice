public class BinarySearch {

    public static int BinarySearchArray(int arr[],int key){
        int frist=0; 
        int last =arr.length-1;
        int mid=0;
        while(frist<=last){
            mid=(frist+last)/2;
            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]<key){
                frist=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int key=4;

        // BinarySearchArray(arr,key);
        System.out.println("Number Foun At index : "+BinarySearchArray(arr, key));
    }
}

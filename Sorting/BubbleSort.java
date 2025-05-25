package Sorting;

public class BubbleSort {
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void Printarry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,6,3};
        bubblesort(arr);
        Printarry(arr);
    }
}

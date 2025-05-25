package Sorting;

public class SelectionSort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int max = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max] > arr[j]){
                    max=j;
                }
            }
            int temp = arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
    }
     public static void Printarry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,6,3};
        selectionsort(arr);
        Printarry(arr);
    }
}

package Sorting.Practies;

public class Bubblesortbest {
    public static void bubblesort(int arr[]){
        boolean swape= false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swape=true;
                }
            }
            if(swape==false){
                System.out.println("Already array was sorted");
                break;

            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        bubblesort(arr);
    }
}

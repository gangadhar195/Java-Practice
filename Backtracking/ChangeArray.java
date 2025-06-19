public class ChangeArray {
    public static void changearray(int arr[],int i,int val){
        if(i==arr.length){
            printArray(arr);
            System.out.println();
            return;
        }
        arr[i]=val;
        changearray(arr, i+1, val+1);
        arr[i]=val-2;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]= new int[5];
        changearray(arr,0,1);
        printArray(arr);
    }
}

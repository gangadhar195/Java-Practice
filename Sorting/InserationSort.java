public class InserationSort {
    public static void inserationsort(int arr[]){
        for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        int pre = i-1;
        while(pre >=0 && arr[pre] > curr){
            arr[pre +1]= arr[pre];
            pre--;
        }
        arr[pre+1]=curr;
    }
    }
     public static void Printarry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,6,3,11,11,43,23};
        inserationsort(arr);
        Printarry(arr);
    }
}

public class MergeSort {
    public static void Printmergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        Printmergesort(arr, si, mid);
        Printmergesort(arr, mid+1, ei);
        merge(arr,mid,si,ei);
    }
    public static void merge(int arr[],int mid,int si,int ei){
        int temp[]= new int[ei-si+1];
        int i=arr[si];
        int j=arr[mid+1];
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {2,5,1,6,4,8};
        // int si=arr[0];
        // int ei = arr.length;
        Printmergesort(arr,0,arr.length-1);
        PrintArr(arr);

    }
}

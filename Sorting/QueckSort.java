public class QueckSort {

   public static void PrintArray(int arr[]){
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }

   }
   public static void queckSort(int arr[],int si,int ei){
      if(si>ei){
         return;
      }
      int pIdex = partition(arr,si,ei);
      queckSort(arr, si, pIdex-1);
      queckSort(arr, pIdex+1, ei);
   }
   public static int partition(int arr[],int si,int ei){
      int pivot = arr[ei];
      int i=si-1;
      for(int j=si;j<ei;j++){
         if(arr[j]<=pivot){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
         }
      }
      i++;
      int temp=pivot;
      arr[ei]=arr[i];
      arr[i]=temp;
      return i;
   }
   public static void main(String args[]){
    int arr[]={3,2,5,9,8,6,1};
    queckSort(arr,0,arr.length-1);
    PrintArray(arr);
   } 
}

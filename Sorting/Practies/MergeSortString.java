package Sorting.Practies;

public class MergeSortString {

    public static String[] mergesort(String[] fruits,int si,int ei){
        if(si==ei){
            String[] a = {fruits[si]};
            return a;
        }
        int mid = si+(ei-si)/2;
        String[] arr1=mergesort(fruits, si, mid);
        String[] arr2 = mergesort(fruits, mid+1, ei);
        String[] arr3=merge(arr1,arr2);
        return arr3;
    }

    public static String[] merge(String[] arr1,String[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        int idx=0;
        String[] arr3= new String[n+m];
        while(i<n && j<m){
            if(isAlphabeticaly(arr1[i],arr2[j])){
                arr3[idx]=arr1[i];
                i++;
                idx++;
            }else{
                arr3[idx]=arr2[j];
                j++;
                idx++;
            }
        }
        while(i<m){
            arr3[idx]=arr1[i];
            i++;
            idx++;
        }
        while (j<m) {
            arr3[idx]=arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    public static boolean isAlphabeticaly(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String[] fruits={"mango","banana","apple","orange"};
       String[] a= mergesort(fruits,0,fruits.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

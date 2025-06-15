public class RotateArray {

    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }

        //Line one
        if(arr[si]<=arr[mid]){
            //left side
            if(arr[si]<=tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //right side
            else{
                return search(arr, tar, mid+1, ei);
            }
        }

        //Line two 
        else{
            //left side
            if(arr[mid]<=tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                //right side
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static int searchtwo(int arr[],int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
    int arr[] = {2,4,6,8,9,1,5};
    int tar = 0;
//    int tarIdx= search(arr,tar,0,arr.length-1);
//    System.out.println(tarIdx);
       int idx= searchtwo(arr,tar);
       System.out.println(idx);

    }
}

public class TwoDArray{
    public static void main(String[] args) {
        int arr[][]={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+"\t");
                }
        }
    }
}
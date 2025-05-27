package Assignments;

public class Array2DAssignment {
    // public static void FindArrayElement(int array[][],int key){
    //     int sum=0;
    //     for(int i=0;i<array.length;i++){
    //         for(int j=0;j<array[0].length;j++){
    //             if(key==array[i][j]){
    //             sum++;
    //         }
    //         }
            
    //     }
    //     System.out.println(sum);
    // }
    public static void SumOfSecondRow(int array[][]){
        int sum=0;
        int row=1,col=array.length;
        for(int i=0;i<col;i++){
            sum+=array[row][i];
        }
        System.out.println("Sum of Second Row is : "+sum);
    }
    public static void main(String args[]){
        // int array[][] = {
        //     {4,7,8,6},
        //     {8,8,7,7}
        // };
        // FindArrayElement(array,8);
        int array[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        SumOfSecondRow(array);
    }
}

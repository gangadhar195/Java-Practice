package arrays;
public class ArrayBasic {
    public static void main(String args[]){
        //Single Dimension Array
        // int [] marks = new int[] {11,12,13,14,15};
        // String[] names = new String[] {"A","B","C","D"};

        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }
        // for(int i=0;i<names.length;i++){
        //     System.out.print(names[i]+" ");
        // }
        //Multi Dimension Array
        int matrix[][] ={
            {1,2,3,4,5},
            {11,12,13,14,15},
            {21,22,23,24,25}

        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

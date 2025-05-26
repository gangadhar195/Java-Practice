public class SpringMatrix {
    public static void PrintSpringMatrixValue(int matrix[][]) {
        int startRow = 0;
        int endCol = matrix.length - 1;
        int endRow = matrix[0].length - 1;
        int startCol = 0;
        while (startRow <= endRow && startCol <= endCol) {
            //topcol
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //rightcol
            for(int i=startRow+1;i<=endRow;i++){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            //startcol
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        // for(int i=0;i<matrix.length;i++){
        // for(int j=0;j<matrix[0].length;j++){
        // System.out.print(matrix[i][j]+" ");
        // }
        // System.out.println();
        // }
        PrintSpringMatrixValue(matrix);
    }
}

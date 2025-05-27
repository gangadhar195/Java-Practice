public class DiagonalMatrixSum {
    public static int SumofDiagonalMatrix(int Matrix[][]){
        int sum=0;
            System.out.println("Matrix Length : "+Matrix.length);
            System.out.println("Matrix Length 0 : "+Matrix[0].length);

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){

                if(i==j){
                    sum+=Matrix[i][j];
                }
                else if(i+j==Matrix.length-1){
                    sum+=Matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int Matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(SumofDiagonalMatrix(Matrix));
    } 
}

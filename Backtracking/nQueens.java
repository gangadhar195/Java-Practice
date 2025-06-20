public class nQueens {

    public static void nqueens(char board[][],int row){
        if(row==board.length){
            printCahr(board);
            return;
        }
        for(int i=0;i<board.length;i++){
            board[row][i]='Q';
            nqueens(board, row+1);
            board[row][i]='X';
        }
    }

    public static void printCahr(char board[][]){
        System.out.println("-----------Chess Board--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=2;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueens(board,0);
    }
}

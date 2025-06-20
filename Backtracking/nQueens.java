public class nQueens {

    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //daigonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //daigonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nqueens(char board[][],int row){
        if(row==board.length){
            // printCahr(board);
            count++;
            return true;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
            board[row][i]='Q';
           if(nqueens(board, row+1)){
            return true;
           }
            board[row][i]='X';
            }
        }
        return false;
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
     public static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        if(nqueens(board,0)){
            System.out.println("Solution is possible : ");
            printCahr(board);
        }
        System.out.println("No are ways to print Queen: "+count);
    }
}

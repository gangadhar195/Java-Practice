public class StaireCaseSearch {
    public static boolean StaireSearch(int martrix[][],int key){
        int row =0, col=martrix.length-1;
        while(row<=martrix.length && col>=0){
            if(key==martrix[row][col]){
                System.out.println("Key Found at : ("+row+","+col+")");
                return true;
            }
            else if(key < martrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String args[]){
        int martrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        StaireSearch(martrix,35);
    }
}

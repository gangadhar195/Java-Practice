public class Practice4 {
    public static void main(String args[]){
        //Questions 1 Hollow Rectangle
        // int n=5;
        // int m=4;
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==m || j==1 || j==n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Questions 2 invert and rotated half pyramid 
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

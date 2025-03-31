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
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Questions 3 invert half pyramid with number pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i +1;j++){
        //         System.out.print(j);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //Questions 4 Floyd's Triangle pattern
        // int n=5;
        // int j=0;
        // int k=1;
        // for(int i=1;i<=n;i++){
        //     for( j=1;j<=i;j++){
        //         System.out.print(k + " ");
        //     k++;

        //     }
        //     System.out.println();
        // }
        //Questions 5 01 Triangle pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum=i+j;
        //         if(sum % 2==0){
        //             System.out.print(1);
        //         }
        //         else{
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println(" ");
        // }

        //Question 6 Butterfly pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question 7 solid rhombus pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<n-i+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Question 8 Hollow rhombus pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<n-i+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==n || j==1 || j==n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");

        //         }
        //     }
        //     System.out.println();
        // }

        //Questions 9 Diamond pattern
        // int n=5;
        // for(int i=1;i<n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Question 10 Number pyramid pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<n-i+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

         //Question 11 palindromic  pattern with numbers pattern
         int n=5;
         for(int i=1;i<=n;i++){
             for(int j=1;j<n-i+1;j++){
                 System.out.print(" ");
             }
             for(int j=i;j>=1;j--){
                 System.out.print(j);
                 
             }
             for(int j=2;j<=i;j++){
                System.out.print(j);
            }
             System.out.println();
         }
        
    }
}

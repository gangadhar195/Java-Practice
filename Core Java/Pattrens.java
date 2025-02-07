public class Pattrens {
    public static void main(String[] args){
        //1.Solid Reactangle
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //2.Hollow Reactangle
        // int n=4;
        // int m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //         System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //3.Half Pyramid
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
        // //4. Invert Half Pyramid
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //5. Invert Half Pyramid (rotate 180 deg)
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     //ineer loop for print space
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //ineer loop for printing star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }

        //6.Half Pyramid with Number
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // } 
        // //7.Invert Half Pyramid with Number
        // int n=5;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //8.Floyd's Triangle
        // int n=5;
        // int Number =1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){

        //         System.out.print(Number+" ");
        //         Number++;
        //     }
        //     System.out.println();
        // }
            //9.0-1 Triangle
    //         int n=5;
    //         for(int i=1;i<=n;i++){
    //             //inner loop
    //             for(int j=1;j<=i;j++){
    //                 int sum = i+j;
    //                 if(sum %2 ==0){
    //                     //even
    //                     System.out.print("1 ");
    //                 }else{
    //                     System.out.print("0 ");
    //                 }
    //             }
    //             System.out.println();
    //         }

    //10.Butterfly Pattern
    
    // int n=4;
    // //Upper part
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int space = 2*(n-i);

    //     for(int j=1;j<=space;j++){
    //         System.out.print(" ");
    //     }for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // //lower part
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int space = 2*(n-i);

    //     for(int j=1;j<=space;j++){
    //         System.out.print(" ");
    //     }for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //11.Solid Rhombus
    // int n=5;
    // for(int i=1;i<=5;i++){
    //     //gap
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //12.Number Pyramid
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+ " ");
    //     }
    //     System.out.println();
    // }
    //13.Palindromic Pyramid

    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i;j>=1;j--){
    //         System.out.print(j );
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    //14.Diamond Pattern

    int n=4;
    //upper shape of diamond
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //Lower Shape of diamond
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

}

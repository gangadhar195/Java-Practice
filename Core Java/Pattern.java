public class Pattern {
    public static void main(String args[]){
        // for(int i=5;i>0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //inverted star Pattern

        // int n=5;
        // for(int line=1;line<=n;line++){
        //     for(int star=1;star<=n-line+1;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Half Pyramid Pattern
        int n= 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        char ch ='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

public class ArrayPractice {
    public static void FindElement(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println(n+"Found At index : "+i);
                break;
            }
            
        }
        
            System.out.println("Not found ");
        
    }
    public static void main(String args[]){
        int n=5;
        int arr[]={1,2,3,4,5,2};
        FindElement(arr,n);
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=5-i+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=5-i+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<i;j++){
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }
    }
}

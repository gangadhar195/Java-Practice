public class MaxSumArray {

   public static void PrintMaxArraySum(int numbers[]){
            int currSum = 0;
            int MaxVal = Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
               int start = i;
               for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(MaxVal < currSum){
                    MaxVal = currSum;
                }
               }

            }
                System.out.println("Sum Of Max Array : "+ MaxVal);

    }
    public static void main(String args[]){
        int number[] = {1,-2,6,-1,3};
        PrintMaxArraySum(number);
    }
}

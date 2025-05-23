public class MaxSumArray {

   public static void PrintMaxArraySum(int numbers[]){
            int currSum = 0;
            int MaxVal = Integer.MIN_VALUE;
            int prefix[] = new int[numbers.length];
            prefix[0]= numbers[0];
            
            for(int i=1;i<prefix.length;i++){
                prefix[i] = prefix[i-1] + numbers[i];
            }
            for(int i=0;i<numbers.length;i++){
               int start = i;
               for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum=0;

                currSum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
                // for(int k=start;k<=end;k++){
                //     currSum += numbers[k];
                // }
                // System.out.println(currSum);
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

public class TillingProblem {

        public static int tillingProblems(int n){
                if(n==0 || n==1){
                    return 1;
                }
            int fnm1 = tillingProblems(n-1);
            int fnm2 = tillingProblems(n-2);
            int totalways = fnm1 + fnm2;
            return totalways;
        }
    public static void main(String args[]){
        System.out.println(tillingProblems(4));
    }
}

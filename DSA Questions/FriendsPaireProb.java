public class FriendsPaireProb {

    public static int friendsPaireProblem(int n){
        if(n==1||n==2){
            return 1;
        }
        int fnm1 =  friendsPaireProblem(n-1);
        int fnm2 = friendsPaireProblem(n-2);
        int totalWays = (n-1)*fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(friendsPaireProblem(3));
    }
}

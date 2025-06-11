public class BinaryStrProblem {

    public static void OnesConsecutives(int n,String str,int lastPlaces){
        if(n==0){
            System.out.println(str);
            return;
        }
        OnesConsecutives(n-1, str+"0",0); 
        if(lastPlaces==0){
            OnesConsecutives(n-1,str+"1",1);
        }
    }
    public static void main(String args[]){
        OnesConsecutives(3, "", 0);
    }
}

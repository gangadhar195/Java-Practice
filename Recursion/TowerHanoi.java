public class TowerHanoi {

    public static void PrintHonai(int n,String s,String h,String d){
        if(n==1){
            System.out.println("Transfer "+n+" from "+s+" to "+d);
            return;
        }
        PrintHonai(n-1, s, d, h);
        System.out.println("Transfer desh "+n + " from" + s+" to "+d);
        PrintHonai(n-1, h, s, d);
    }
    public static void main(String args[]){
        int n=3;
        PrintHonai(n,"S","H","D");
    }
}

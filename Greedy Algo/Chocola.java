import java.util.*;

public class Chocola{
    public static void main(String args[]){
        int n=4,m=6;
        Integer costHor[] = {2,1,3,1,4};
        Integer costVer[] ={4,1,2};

        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());
        int h=0,v=0,vp=1,hp=1,cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<=costHor[h]){
                cost+=(costHor[h]*vp);
                h++;
                hp++;
            }else{
                cost+=(costVer[v]*hp);
                v++;
                vp++;
            }
        }
        //remaing horizontal line
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
            h++;
            hp++;
        }
        while(v<costVer.length){
            cost+=(costVer[v]*hp);
            v++;
            vp++;
        }
        System.out.println("Minimum cuts price : "+cost);
    }
}
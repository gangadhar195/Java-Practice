import java.util.*;
public class ChainLenMax {
   public static void main(String args[]){
    int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
    Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
    int chainlenth = 1;
    int chainEnd = pairs[0][1];
    ArrayList<Integer> ans=new ArrayList<>();
    for(int i=1;i<pairs.length;i++){
        if(pairs[i][0]>chainEnd){
            chainlenth++;
            ans.add(pairs[i][0]);
            ans.add(pairs[i][1]);
            chainEnd=pairs[i][1];
        }
    }
    System.out.println("Maximun length of chain : "+chainlenth);
    for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
    }
    System.out.println();
   } 
}

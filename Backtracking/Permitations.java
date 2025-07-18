package Backtracking;

public class Permitations {

    public static void findpermutation(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+' ');
            return;
        }
        for(int i=0;i<str.length();i++){
                char curr = str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            findpermutation(newStr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str="abc";
        findpermutation(str,"");
    }
}

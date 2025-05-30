package String;

public class StringBuilderMethod {
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("");
        for(char i='a';i<='z';i++){
            str.append(i);
        }
        System.out.println(str);
        System.out.println(str.length());
 }
}

package String;

public class StringBuilderMethod {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        // StringBuilder str = new StringBuilder("");
        // for(char i='a';i<='z';i++){
        //     str.append(i);
        // }
        // System.out.println(str);
        // System.out.println(str.length());

        String str = " hi i am gangadhar";
        // toUpperCase(str);

        System.out.println(toUpperCase(str));
 }
}

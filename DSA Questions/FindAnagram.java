import java.util.Arrays;
public class FindAnagram {
    public static void main(String args[]){
        String str1 = "race";
        String str2 = "raec";
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length()==str2.length()){
        char str1char[] = str1.toCharArray();
        char str2char[] = str2.toCharArray();

        Arrays.sort(str1char);
        Arrays.sort(str2char);
        boolean result = Arrays.equals(str1char,str2char);

        if(result){
            System.out.println(str1+" And "+str2+" Are anagram string");
            
        }else{
            System.out.println(str1+" And "+str2+" are not angram string");
        }
        }else{
            System.out.println(str1+" And "+str2+" are not angram string");

        }
    }
}

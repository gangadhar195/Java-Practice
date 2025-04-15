import java.util.Arrays;

public class Strings {
static boolean CheckAnagram(String str1,String str2){
int ch1[]= new int[26];
    int ch2[]= new int[26];
    for(int i=0;i<str1.length();i++){
        char ch =str1.charAt(i);
        int idx = ch -'a';
        ch1[idx]++;
    }
    for(int j=0;j<str2.length();j++){
        char ch22 =str2.charAt(j);
        int idx1 = ch22-'a';
        ch2[idx1]++;
    }
    return Arrays.equals(ch1, ch2);
}
    public static void main(String args[]){
        // long StartTime = System.currentTimeMillis();
    //     StringBuffer buffer = new StringBuffer("Hello");
    //     buffer.append(" World");
    //     // buffer.delete(2, 3);
    //     // buffer.reverse();
    //     for(int i=0;i<1000;i++){
    //         System.out.println(buffer);

    //     }
    //     System.out.println(System.currentTimeMillis()-StartTime);

    // StringBuilder builder = new StringBuilder("Hi");
    // builder.append(" Gangadhar");
    // // System.out.println(builder);

    // for(int i=0;i<1000;i++){
    //     System.out.println(builder);

    // }
    // System.out.println(System.currentTimeMillis()-StartTime);

    // String str1="Hello";
    // String str2="Word";
    // boolean result = str1.equals(str2);
    // System.out.println(result);
    // System.out.println(str1.hashCode());
    // String str = str1.replace("l", "R");
    // String str3 = str1.intern();
    // System.out.println(str);
    // System.out.println(str3);
    // System.out.println(str1.charAt(3));

    // String str1="yash";
    // String str2="shya";
    // String wel ="Welcome";
    // String h = " To Home Gangadhar";
    
    //     boolean result = CheckAnagram(str1,str2);
    //     String message = wel.concat(h);
    //     System.out.println("Result is : "+result);
    //     System.out.println(message);
    //String Imutable

        String name="Gangadher";
        System.out.println(name+"before Hascode : "+name.hashCode());
        name="Rama";
        System.out.println(name+" after HashCode : "+name.hashCode());

        StringBuilder builder= new StringBuilder("gangadhar");
        System.out.println(builder +"before Hashcode : "+builder.hashCode());
        builder.append("Rama");
        System.out.println(builder +"after Hashcode : "+builder.hashCode());

    }
}

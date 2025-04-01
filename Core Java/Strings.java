public class Strings {
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = new String(" Word");
        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str1.equals(str3));
        System.out.println(str1.concat(str2));
        System.out.println(str1.contains(str2));
        System.out.println(str3.contains("Hello"));
        System.out.println(str3.trim());
        System.out.println(str3.substring(0,5));
        System.out.println(str3.charAt(4));
        



    }
}

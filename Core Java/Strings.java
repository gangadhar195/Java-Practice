public class Strings {
    public static void main(String args[]){
        // String str1 = "Hello";
        // String str2 = new String(" Word");
        // String str3 = str1 + str2;
        // System.out.println(str3);
        // System.out.println(str3.length());
        // System.out.println(str1.equals(str3));
        // System.out.println(str1.concat(str2));
        // System.out.println(str1.contains(str2));
        // System.out.println(str3.contains("Hello"));
        // System.out.println(str3.trim());
        // System.out.println(str3.substring(0,5));
        // System.out.println(str3.charAt(4));
        // System.out.println(str3.toLowerCase());
        // System.out.println(str3.toUpperCase());
        // System.out.println(str3.indexOf("r", 0));

        //String Buffer
        StringBuffer buffer=new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer.capacity());
        System.out.println(buffer);


        //String Builder
        StringBuilder builder=new StringBuilder("Hello");
        builder.append(" World");
        System.out.println(builder.capacity());
        System.out.println(builder);
    }
}

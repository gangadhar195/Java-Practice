public class TypeConversion {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        //int to float Conversion
        int a = 20;
        float b = a;
        System.out.println("int to float : "+b);
        // float to int Conversion 
        float number1= 89.99f;
        int number2 = (int)number1;
        // System.out.println(number2);
        System.out.println("float :to int "+number2);

        // Char to int conversion
        char ch = 'a';
        int number = ch;
        System.out.println("char to int concersion : "+number);

        // java automatically promotes each byte ,short char operand to int when evaulting expression
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println((int)ch1);
        System.out.println((int)ch2);

        System.out.println(ch2-ch1);
         
        // if one oprand is long ,float and double the hole expression is promoted to long . float or double respectively
        int x = 10;
        float y = 20.12f;
        double z = 29;
        long l = 45;
        double ans = x + y + z + l;
        System.out.println("Respectively Assign Value : "+ (int)ans);

    }
}

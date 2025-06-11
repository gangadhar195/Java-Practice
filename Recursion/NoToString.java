public class NoToString {

    public static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void PrintString(int number){
        if(number==0){
            return;
        }
        int lastdigit = number%10;
        PrintString(number/10);
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main(String args[]){
        int number=12345;
        PrintString(number);
    }
}

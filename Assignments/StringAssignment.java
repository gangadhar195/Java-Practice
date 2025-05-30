package Assignments;

import java.util.Scanner;

public class StringAssignment {
    public static void FindLowerCseOvel(String name){
        int count =0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
            }   
            
        }
        System.out.println("Count of ovels : "+count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        FindLowerCseOvel(str);
    }
}

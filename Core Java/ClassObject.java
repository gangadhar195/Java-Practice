import java.util.*;

public class ClassObject {
    public static void main(String[] args){
        Student student = new Student();
        student.GetData();
        student.Display();
    }
}

class Student{
    int[] Stud = new int[5];
    int student_id;
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    public void GetData(){
        System.out.print("Enter Student ID : ");
        student_id=sc.nextInt();
        System.out.print("Enter Student Name : ");
        name = sc.next();
        System.out.print("Enter Student Age : ");
        age = sc.nextInt();

    }
    public void Display(){
        System.out.println("Student ID : "+student_id);
        System.out.println("Student Name : "+name);
        System.out.println("Age : "+age);

    }
}



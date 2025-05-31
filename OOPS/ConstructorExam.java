package OOPS;

public class ConstructorExam {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Gangadhar";
        s1.roll=123;
        s1.pass="123";
        s1.mark[0]=100;
        s1.mark[1]=99;
        s1.mark[2]=88;
        // Student s2=new Student("Gangadhar");
        // System.out.println(s2.name);
        // Student s3=new Student(1432);
        // System.out.println(s3.roll);
        Student s2 = new Student(s1);
        s2.pass="xyz";
        s1.name="Vinayak";
        s1.mark[2]=80;
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.pass);
        for(int i=0;i<3;i++){
            System.out.println(s2.mark[i]);
        }

    }
}
class Student{
    String name;
    int roll;
    String pass;
    int mark[] = new int[3];
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        this.mark=s1.mark;
    }
    Student(){
        System.out.println("Constructor is called..");
    }
    Student(String name){
        this.name=name;
        // this.mark=mark;
    }
    Student(int roll){
        this.roll=roll;
    }
}
package OOPS;

public class StaticFunData {
    public static void main(String args[]){
        Student s = new Student();
        s.SchollName="BMC44";
        Student s2= new Student();
        System.out.println(s2.SchollName);
        Student s1 = new Student();
        s1.SchollName="IIT Bombay";
        System.out.println(s1.SchollName);
        System.out.println(s.SchollName);
        System.out.println(s2.SchollName);


    }
}

class Student{
    String name;
    int roll;
    static String SchollName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
     return this.name;
    }
}
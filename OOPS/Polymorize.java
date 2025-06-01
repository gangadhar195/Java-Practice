package OOPS;

public class Polymorize {
    public static void main(String args[]){
        // Student s1 = Student.StudentMark(88,81,90);
        Student.StudentMark(90,89,99);
        Student.StudentMark(90.0, 89.7, 99.9);
    }
}
class Student{
   static void StudentMark(int phy,int che, int math){
        int ave = (phy+che+math/3);
        System.out.println(ave);
    }
    static void StudentMark(double phy,double che, double math){
        double ave = (phy+che+math/3);
        System.out.println(ave);
    }
}
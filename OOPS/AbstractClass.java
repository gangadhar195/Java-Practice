package OOPS;

public class AbstractClass {
    public static void main(String args[]){
        Fish f= new Fish();
        f.Eates();
        // Horse h = new Horse();
        // h.Eats();
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal class");
    }
    abstract void Eats();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Class");
    }
    void Eats(){
        System.out.println("Eates grass");
    }
}
class Fish extends Horse{
    Fish(){
        System.out.println("Fish class");
    }
    void Eates(){
        System.out.println("Eats small fish");
    }
}